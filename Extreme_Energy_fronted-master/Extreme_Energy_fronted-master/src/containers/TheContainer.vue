<template>
  <div id="root">
    <el-container style="height: 100%">
      <!-- <el-aside width="autoWidth" style="height: 90vh; margin-top: 7vh">
        <el-col :span="5">
          <el-menu router :collapse="vi" class="el-menu-vertical-demo" @open="handleOpen" @close="handleClose"
            text-color="#fff" background-color="rgb(16, 144, 161)" active-text-color="#ffd04b">
            <el-submenu index="1">
              <template #title>
                <i class="el-icon-s-marketing"></i>
                <span>核心模型</span>
              </template>
              <el-menu-item-group>
                <el-menu-item index="sinter-realtime">
                  <i class="el-icon-menu"></i>
                  <template #title>机械臂控制</template>
                </el-menu-item>
                <el-menu-item index="material-composition">
                  <i class="el-icon-star-off"></i>
                  <template #title>视觉抓取</template>
                </el-menu-item>
                <el-menu-item index="procedure-param">
                  <i class="el-icon-thumb"></i>
                  <span>页面3</span>
                </el-menu-item>
                <el-menu-item index="energy-efficiency">
                  <i class="el-icon-c-scale-to-original"></i>
                  <span>页面4</span>
                </el-menu-item>
                <el-menu-item index="historical-case">
                  <template #title>
                    <i class="el-icon-time"></i>
                    <span>页面5</span>
                  </template>
                </el-menu-item>
                <el-menu-item index="search-engine">
                  <template #title>
                    <i class="el-icon-collection-tag"></i>
                    <span>页面6</span>
                  </template>
                </el-menu-item>
              </el-menu-item-group>
            </el-submenu>
          </el-menu>
        </el-col>
      </el-aside> -->
      <el-container style="height: 100%">
        <el-main>
          <el-header style="width: 101%; background-color:rgb(16, 144, 161)" class="title">
            <div class="current-time" style="margin-top: 18px;font-size: 18px;">{{ currentTime }}</div>
            <div id="power-indicator"
              style="width: 10px; height: 10px; border-radius: 50%; margin-left: 900px;margin-top: -15px;"></div>
            <div class="menu-container" style="display: flex; margin-top: -10px;">
              <el-menu router :collapse="vi" class="el-menu-horizontal-demo" mode="horizontal" text-color="#fff"
                background-color="rgb(16, 144, 161)" active-text-color="#ffd04b" style="display: flex;">
                <el-menu-item index="sinter-realtime" style="margin-right: 10px;">
                  <i class="el-icon-menu"></i>
                  机械臂控制
                </el-menu-item>
                <el-menu-item index="material-composition" style="margin-right: 10px;">
                  <i class="el-icon-star-off"></i>
                  视觉抓取
                </el-menu-item>
                <el-menu-item index="procedure-param" style="margin-right: 10px;">
                  <i class="el-icon-thumb"></i>
                  页面3
                </el-menu-item>
                <el-menu-item index="energy-efficiency" style="margin-right: 10px;">
                  <i class="el-icon-c-scale-to-original"></i>
                  页面4
                </el-menu-item>
              </el-menu>
            </div>
          </el-header>
          <transition name="fade" mode="out-in">
            <router-view :key="$route.path"></router-view>
          </transition>
        </el-main>
      </el-container>
      <!-- <el-container style="height: 100%">
        <el-header style="width: 101%; background-color: rgb(16, 144, 161)" class="title">
          <div class="current-time" style="margin-top: 18px; font-size: 18px;">{{ currentTime }}</div>
          <div id="power-indicator"
            style="width: 10px; height: 10px; border-radius: 50%; margin-left: 900px; margin-top: -15px;"></div>
          <el-menu router :collapse="vi" class="el-menu-horizontal-demo" mode="horizontal" text-color="#fff"
            background-color="rgb(16, 144, 161)" active-text-color="#ffd04b">
            <el-submenu index="sinter-realtime">
              <template #title>
                <i class="el-icon-menu"></i>
                机械臂控制
              </template>
              <el-menu-item index="sinter-realtime">
                机械臂控制界面
              </el-menu-item>
            </el-submenu>
            <el-submenu index="material-composition">
              <template #title>
                <i class="el-icon-star-off"></i>
                视觉抓取
              </template>
              <el-menu-item index="material-composition">
                视觉抓取界面
              </el-menu-item>
            </el-submenu>
          </el-menu>
        </el-header>
        <el-main>
          <transition name="fade" mode="out-in">
            <router-view :key="$route.path"></router-view>
          </transition>
        </el-main>
      </el-container> -->
    </el-container>
  </div>
</template>
<script src="https://code.jquery.com/jquery-3.6.0.min.js"></script>
<script>
export default {
  data() {
    return {
      currentTime: '',
      vi: true,
      isPowerOn: true, // 假设初始状态为开机
    };
  },
  mounted() {
    this.updateCurrentTime();
    setInterval(this.updateCurrentTime, 1000);
    setInterval(this.togglePower, 5000);
  },
  methods: {
    updateCurrentTime() {
      const now = new Date();
      const year = now.getFullYear();
      const month = String(now.getMonth() + 1).padStart(2, '0');
      const day = String(now.getDate()).padStart(2, '0');
      const hour = String(now.getHours()).padStart(2, '0');
      const minute = String(now.getMinutes()).padStart(2, '0');
      const second = String(now.getSeconds()).padStart(2, '0');
      this.currentTime = `${year}-${month}-${day} ${hour}:${minute}:${second}`;
    },
    togglePower() {
  // 模拟开关机状态的变化
  this.isPowerOn = !this.isPowerOn;

  // 获取 #power-indicator 元素
  const powerIndicator = document.getElementById('power-indicator');

  // 根据开关机状态设置样式
  if (this.isPowerOn) {
    powerIndicator.style.backgroundColor = 'green'; // 设置开机状态下的样式
  } else {
    powerIndicator.style.backgroundColor = 'red'; // 设置关机状态下的样式
  }
},
    handleOpen(key, keyPath) {
      console.log(key, keyPath);
    },
    handleClose(key, keyPath) {
      console.log(key, keyPath);
    }
  },
};
</script>

<style>
.power-on {
  width: 10px;
  height: 10px;
  border-radius: 50%;
  margin-left: 10px;
  background-color: green;
}

.power-off {
  width: 10px;
  height: 10px;
  border-radius: 50%;
  margin-left: 10px;
  background-color: red;
}

h3,
h4 {
  color: lightgray;
  text-align: center;
}

.page_title {
  text-shadow: 0 0 10px #1c55c4, 0 0 20px #1c55c4, 0 0 20px #1c55c4,
    0 0 20px #1c55c4;
}

.light_text {
  color: lightgray;
  text-shadow: 0 0 10px #1c55c4, 0 0 20px #1c55c4, 0 0 20px #1c55c4,
    0 0 20px #1c55c4;
}

.dark_select {
  color: lightgray;
  height: 42px;
  background: RGB(6, 11, 82);
}

::-webkit-scrollbar {
  width: 5px;
}

::-webkit-scrollbar-thumb {
  background-color: #99959563;
  border-radius: 3px;
}

.el-submenu__title:focus,
.el-submenu__title:hover {
  outline: 0 !important;
  color: #409eff !important;
  background: transparent !important;
}

.el-menu-item-group__title {
  margin-top: -15px;
}

.el-menu-vertical-demo:not(.el-menu--collapse) {
  width: 260px;
  height: 100%;
}

.title {
  color: rgba(211, 211, 211, 0.74);
  /* text-align: center; */
  padding-left: 32%;
  font-size: 1.5vmax;
  position: relative;
}

.current-time {
  position: absolute;
  /* 将实时时间容器定位到头部上 */
  top: 0;
  right: 20px;
  /* 调整实时时间容器在头部中的位置 */
  color: #fff;
}
</style>

<style scoped>
.fade-enter-active,
.fade-leave-active {
  transition: opacity 0.3s;
}

.fade-enter,
.fade-leave-to {
  opacity: 0;
}

.el-menu--horizontal>.el-submenu .el-submenu__title,
.el-menu--horizontal>.el-submenu.is-active .el-submenu__title,
.el-menu-item:hover {
  outline: 0 !important;
  color: #409eff !important;
  background: transparent !important;
}

.el-submenu:hover {
  outline: 0 !important;
  color: #409eff !important;
  background: transparent !important;
}

.el-menu-item.is-active {
  color: gold !important;
  border-bottom-color: transparent !important;
}

.el-menu--horizontal>.el-submenu.is-active .el-submenu__title {
  color: gold !important;
  border-bottom-color: transparent !important;
}

.el-menu--horizontal:focus,
.nav-menu-son .el-menu--horizontal:hover {
  background: transparent !important;
}

.el-menu {
  background-color: transparent !important;
}

.el-menu-item a:hover {
  background: transparent;
}

.el-menu--popup-bottom-start {
  margin-top: -2px;
}

.el-menu--popup {
  background: none !important;
  padding: 0 0;
  min-width: 120px !important;
  line-height: 40px !important;
  box-shadow: 0 4px 8px 0;
  border-radius: 5px;
}

.el-menu--horizontal .el-menu {
  background: none;
}

.el-menu--horizontal .el-menu .el-menu-item,
.el-menu--horizontal .el-menu .el-submenu__title {
  background-color: transparent;
  float: none;
  height: 36px;
  line-height: 36px;
  padding: 0 22px;
  color: transparent !important;
  z-index: 100;
  font-weight: 500;
}

.el-menu--popup-bottom-start .el-menu-item:hover {
  color: transparent !important;
  color: #0056b3;
}

.el-menu--popup-bottom-start .el-menu-item {
  background: #fff !important;
}

.el-aside {
  transition: width 0.5s;
  -webkit-transition: width 0.5s;
  -moz-transition: width 0.5s;
  -webkit-transition: width 0.5s;
  -o-transition: width 0.5s;
}

.el-menu-vertical-demo:not(.el-menu--collapse) {
  width: 260px;
  height: 100%;
}

#root {
  display: flex;
  display: -webkit-flex;
  height: 100vh;
  flex-direction: column;
  -webkit-box-orient: vertical;
  -webkit-box-direction: normal;
  /* background: url("~@/../public/img/background.png") no-repeat; */
  background-size: 100% 100%;
  -webkit-background-origin: content-box;
  /*Safari */
  background-origin: content-box;
}
</style>