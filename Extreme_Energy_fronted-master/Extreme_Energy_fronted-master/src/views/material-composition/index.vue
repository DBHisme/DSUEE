<template>
  <div>
    <el-row :gutter="20">
      <el-col :span="14">
        <div class="grid-content bg-purple">
          <img width="700" height="500" ref="cameraFeed" :src="videoUrl" alt="Camera Feed" />
          <el-button @click="sendMessage({ action: 'start' })" class="cool-button">start</el-button>
          <el-button @click="sendMessage({ action: 'stop' })" class="cool-button">stop</el-button>
        </div>
      </el-col>
      <el-col :span="10">
        <div class="grid-content bg-purple">
          <div>
            <div class="section-divider">
              <h2><span class="section-title">识别到的物品如下</span></h2>
            </div>
            <el-table :data="tableData" class="custom-table" style="width: 400px;"
              :header-cell-style="{ background: 'rgb(16, 144, 161)' }">
              <el-table-column class="el-table-column" label="类别" prop="category"></el-table-column>
              <el-table-column class="el-table-column" label="数量" prop="quantity"></el-table-column>
            </el-table>
          </div>
          <div class="section-divider" style="margin-top: 20px;">
            <h2>选择要抓取的物品</h2>
          </div>
          <div class="goods">
            <el-checkbox style="margin-left: 30px;margin-top: 30px;" v-model="checked1"
              @change="sendMessage({ action: 'select', item: 'cup', checked: checked1 })" label="cup" border
              class="custom-checkbox"></el-checkbox>
            <div style="margin-top: 20px;margin-left: 30px;">
              <el-checkbox v-model="checked2" @change="sendMessage({ action: 'select', item: 'box', checked: checked2 })"
                label="box" border class="custom-checkbox"></el-checkbox>
            </div>
            <div style="margin-top: 20px;margin-left: 30px;">

              <el-checkbox v-model="checked3"
                @change="sendMessage({ action: 'select', item: 'bottle', checked: checked3 })" label="bottle" border
                class="custom-checkbox"></el-checkbox>
            </div>
          </div>
        </div>
      </el-col>
    </el-row>
  </div>
</template>

<script>
import WebSocket from 'websocket';
export default {
  mounted() {
    this.fetchDictionaryData();
    this.connectWebSocket();
  },
  name: 'Test3View',
  data() {
    return {
      videoUrl: "http://127.0.0.1:5000/video",
      selectedItems: [],
      dictionary: [],
      tableData: [],
      cameraStream: null,
      number: "0",
      checked1: true,
      checked2: false,
      checked3: false,
      checked4: true,
      checkboxGroup1: [],
      checkboxGroup2: []
    }
  },
  methods:
  {
    connectWebSocket() {
      const wsUrl = "ws://127.0.0.1:5000";

      // 建立 WebSocket 连接
      this.socket = new WebSocket(wsUrl);

      // 监听 WebSocket 连接打开事件
      this.socket.onopen = event => {
        console.log('WebSocket 连接已打开', event);
      };

      // 监听 WebSocket 接收到消息事件
      this.socket.onmessage = event => {
        const data = JSON.parse(event.data);
        // 处理从服务器接收到的数据
        this.handleWebSocketMessage(data);
      };

      // 监听 WebSocket 连接关闭事件
      this.socket.onclose = event => {
        console.log('WebSocket 连接已关闭', event);
      };
    },
    handleWebSocketMessage(data) {
      // 处理从服务器接收到的数据，更新表格或其他界面元素
      // 在这里，你可以将接收到的数据更新到你的表格数据中
      this.tableData = this.convertDictionaryToTableData(data.label_counts_dict);
    },
    convertDictionaryToTableData(dictionary) {
      const tableData = [];
      for (const category in dictionary) {
        if ("category" in dictionary) {
          tableData.push({ category, quantity: dictionary[category] });
        }
      }
      return tableData;
    },
    add() {
      this.number++;
    },
    handleChange(value) {
      console.log(value);
    }
  },
}
</script>
<style>
.section-divider {
  border-left: 5px solid rgb(16, 144, 161);
  padding-left: 10px;
  margin-top: 10px;
}

.section-title {
  display: inline-block;
  background-color: transparent;
  padding: 0 5px;
  position: relative;
  top: -10px;
  margin-top: 10px;
}

.custom-table {
  /* background-color: rgb(16, 144, 161); */
  /* 设置表格背景颜色为黑色 */
  color: #fff;
  /* 设置文本颜色为白色 */
  border: 1px solid #99a9bf;
  min-height: 400px;
  min-width: 600px;
}

.goods {
  border: 1px solid #99a9bf;
  min-height: 300px;
  max-width: 600px;
}



.custom-table th,
.custom-table td {
  border-color: rgb(16, 144, 161);
  /* 设置表头和表格单元格的边框颜色为白色 */
}


.custom-table .cell {
  /* background-color: rgb(16, 144, 161); */
  color: #fff;
  text-align: center;
}

.el-table__header {
  background-color: rgb(16, 144, 161);
  color: #fff;
}

.el-row {
  margin-bottom: 20px;

  &:last-child {
    margin-bottom: 0;
  }
}

.el-col {
  border-radius: 4px;
}

.bg-purple-dark {
  background: #99a9bf;
}

.bg-purple {
  background: transparent;
}

.bg-purple-light {
  background: #e5e9f2;
}

.grid-content {
  border-radius: 4px;
  min-height: 36px;
}

.row-bg {
  padding: 10px 0;
  background-color: #f9fafc;
}

.custom-button {
  font-size: 18px;
  /* 设置字体大小 */
  padding: 80px 60px;
  /* 设置内边距 */
  background-color: rgb(16, 144, 161);
  ;
  /* 设置背景颜色 */
  color: white;
  /* 设置文字颜色 */
  /* 其他自定义样式 */
}

.cool-button {
  width: 200px;
  /* 设置按钮宽度 */
  height: 116px;
  /* 设置按钮高度，六边形的高度需要根据宽度计算 */
  background-color: rgb(16, 144, 161);
  ;
  color: #15d686;
  border: none;
  font-size: 20px;
  clip-path: polygon(50% 0%, 100% 25%, 100% 75%, 50% 100%, 0% 75%, 0% 25%);
  /* 使用clip-path创建六边形 */
  transition: background-color 0.3s, color 0.3s;
}

.cool-button:hover {
  background-color: rgb(14, 78, 87);
  color: #15d686;
  cursor: pointer;
}

.custom-checkbox {
  width: 100px;
}
</style>