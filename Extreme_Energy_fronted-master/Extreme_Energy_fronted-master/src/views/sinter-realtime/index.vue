<template>
  <div class="container">
    <div class="section left-section">
      <div class="di1 section-divider">
        <h2><span class="section-title">笛卡尔坐标控制</span></h2>
      </div>
      <div class="direction-keys">
        <button class="direction-key1">&#8593;</button>
        <div class="horizontal-keys">
          <button class="direction-key2">&#8592;</button>
          <button class="direction-key3">&#8594;</button>
        </div>
        <button class="direction-key4">&#8595;</button>
      </div>
    </div>
    <div class="section center-section">
      <div class="di2 section-divider" style="margin-left: -1px;">
        <h2><span class="section-title">3D视图</span></h2>
      </div>
      <div class="main-content">
        <div class="canvas-container">
        </div>
      </div>
    </div>
    <div class="section right-section">
      <div class="di2 section-divider" style="margin-left: -1px;">
        <h2><span class="section-title">关节控制</span></h2>
      </div>
      <div class="main-content1">
        <div class="joint-list">
          <div class="coordinate">
            <label for="joint1">关节1</label>
            <div class="container1">
              <div class="minus-btn1">&#8722;</div>
              <input class="input-field1" type="text">
              <div class="plus-btn1">&#43;</div>
            </div>
          </div>
          <div class="coordinate">
            <label for="joint2">关节2</label>
            <div class="container1">
              <div class="minus-btn1">&#8722;</div>
              <input class="input-field1" type="text">
              <div class="plus-btn1">&#43;</div>
            </div>
          </div>
          <div class="coordinate">
            <label for="joint3">关节3</label>
            <div class="container1">
              <div class="minus-btn1">&#8722;</div>
              <input class="input-field1" type="text">
              <div class="plus-btn1">&#43;</div>
            </div>
          </div>
          <div class="coordinate">
            <label for="joint4">关节4</label>
            <div class="container1">
              <div class="minus-btn1">&#8722;</div>
              <input class="input-field1" type="text">
              <div class="plus-btn1">&#43;</div>
            </div>
          </div>
          <div class="coordinate">
            <label for="joint5">关节5</label>
            <div class="container1">
              <div class="minus-btn1">&#8722;</div>
              <input class="input-field1" type="text">
              <div class="plus-btn1">&#43;</div>
            </div>
          </div>
          <div class="coordinate">
            <label for="joint6">关节6</label>
            <div class="container1">
              <div class="minus-btn1">&#8722;</div>
              <input class="input-field1" type="text">
              <div class="plus-btn1">&#43;</div>
            </div>
          </div>
        </div>
      </div>
      <div class="di4 section-divider4">
        <h2><span class="section-title4">坐标</span></h2>
      </div>
      <div class="coordinates">
        <div class="coordinate" style="margin-top: 20px;">
          <div class="x1"><label for="x">x:</label>
            <input id="x" type="text" style="width: 30%;" />
            <span style="margin-left: 5px;">mm</span>
          </div>
          <div class="x2"><label for="x">Rx:</label>
            <input id="x" type="text" style="width: 30%;" />
            <span style="margin-left: 5px;">mm</span>
          </div>
        </div>
        <div class="coordinate">
          <div class="x1"><label for="x">y:</label>
            <input id="x" type="text" style="width: 30%;" />
            <span style="margin-left: 5px;">mm</span>
          </div>
          <div class="x2"><label for="x">Ry:</label>
            <input id="x" type="text" style="width: 30%;" />
            <span style="margin-left: 5px;">mm</span>
          </div>
        </div>
        <div class="coordinate">
          <div class="x1"><label for="x">z:</label>
            <input id="x" type="text" style="width: 30%;" />
            <span style="margin-left: 5px;">mm</span>
          </div>
          <div class="x2"><label for="x">Rz:</label>
            <input id="x" type="text" style="width: 30%;" />
            <span style="margin-left: 5px;">mm</span>
          </div>
        </div>
      </div>
    </div>
  </div>
</template>
<script>
import * as THREE from 'three';
import { OrbitControls } from 'three/examples/jsm/controls/OrbitControls';
export default {
  mounted() {
    this.initThree();
    this.renderAxis();
  },
  methods: {
    initThree() {
      this.renderer = new THREE.WebGLRenderer({ antialias: true });
      this.renderer.setSize(650, 800);

      this.renderer.shadowMap.enabled = true;
      this.renderer.shadowMapSoft = true;
      document.querySelector(".canvas-container").appendChild(this.renderer.domElement);

      this.scene = new THREE.Scene();
      this.camera = new THREE.PerspectiveCamera(45, 600 / window.innerHeight, 0.1, 1000);
      this.camera.position.set(100, 100, 100);
      this.camera.lookAt(this.scene.position);
      this.controls = new OrbitControls(this.camera, this.renderer.domElement);

      this.controls.addEventListener('change', this.renderScene);
    },
    renderAxis() {
      // 原点
      const origin = new THREE.Vector3(0, 0, 0);

      // x轴
      const xAxisGeometry = new THREE.BufferGeometry();
      const xAxisPositions = new Float32Array([
        0, 0, 0, // 起点
        20, 0, 0  // 终点
      ]);
      xAxisGeometry.setAttribute('position', new THREE.BufferAttribute(xAxisPositions, 3));
      const xAxisMaterial = new THREE.LineBasicMaterial({ color: 0xff0000 });
      const xAxis = new THREE.Line(xAxisGeometry, xAxisMaterial);
      this.scene.add(xAxis);

      // y轴
      const yAxisGeometry = new THREE.BufferGeometry();
      const yAxisPositions = new Float32Array([
        0, 0, 0, // 起点
        0, 20, 0  // 终点
      ]);
      yAxisGeometry.setAttribute('position', new THREE.BufferAttribute(yAxisPositions, 3));
      const yAxisMaterial = new THREE.LineBasicMaterial({ color: 0x00ff00 }); // 设置y轴颜色为绿色
      const yAxis = new THREE.Line(yAxisGeometry, yAxisMaterial);
      this.scene.add(yAxis);

      // z轴
      const zAxisGeometry = new THREE.BufferGeometry();
      const zAxisPositions = new Float32Array([
        0, 0, 0, // 起点
        0, 0, 20  // 终点
      ]);
      zAxisGeometry.setAttribute('position', new THREE.BufferAttribute(zAxisPositions, 3));
      const zAxisMaterial = new THREE.LineBasicMaterial({ color: 0x0000ff });
      const zAxis = new THREE.Line(zAxisGeometry, zAxisMaterial);
      this.scene.add(zAxis);
    },
    renderScene() {
      this.renderer.render(this.scene, this.camera);
    },
    animate() {
      requestAnimationFrame(this.animate.bind(this));
      this.controls.update(); // 更新控制器状态
      this.renderScene();
    },
  },
};
</script>
<style>
.di1 {
  color: black;
  margin-left: -200px;
  font-size: 16px;
}

.left-section {
  margin-left: -100px;
  font-size: 16px;
}

.di2 {
  color: black;
  margin-left: 20px;
  font-size: 16px;
}

.di3 {
  color: black;
  margin-left: 100px;
  font-size: 1px;
}

.di4 {
  color: black;
  font-size: 16px;
}

.container {
  display: flex;
  min-width: 1000px;
}

.section {
  flex: 1;
}

.direction-keys {
  border: 1px solid gray;
  padding: 10px;
  margin-left: -200px;
  min-width: 500px;
  min-height: 800px;
}

.main-content {
  border: 1px solid gray;
  padding: 10px;
  max-width: 690px;
  max-height: 800px;
}

.canvas-container {
  margin-left: -10px;
  margin-top: -10px;
}

.coordinates {
  border: 1px solid gray;
  padding: 10px;
  min-width: 500px;
  min-height: 228px;
}

.main-content1 {
  border: 1px solid gray;
  padding: 10px;
  min-width: 500px;
  min-height: 500px;
}

.center-section {
  margin-left: 10px;
}

.right-section {
  margin-left: 10px;
}

.direction-keys {
  display: flex;
  flex-direction: column;
  justify-content: center;
  align-items: center;
}

.direction-key1 {
  margin-top: -500px;
}

.direction-key2 {
  margin-left: 0px;
}

.direction-key3 {
  margin-left: 50px;
}

.horizontal-keys {
  margin-top: 10px;
  margin-bottom: 10px;
  display: flex;
}

.direction-keys button {
  font-size: 28px;
  width: 40px;
  height: 40px;
}

.joint-list {
  display: flex;
  flex-direction: column;
  margin-top: 20px;
}

.coordinate {
  display: flex;
  align-items: center;
  margin-bottom: 5px;
}

.coordinate label {
  margin-right: 5px;
}

.coordinate input {
  border: none;
  background-color: white;
  padding: 5px;
  border-radius: 10px;
  border: 1px solid gray;
  margin-left: 20px;
}

.coordinate input:focus {
  outline: none;
  box-shadow: 0 0 5px coral;
}

.joint-input {
  display: flex;
  align-items: center;
}


.joint-btn:focus {
  outline: none;
}

.container1 {
  display: flex;
  align-items: center;
  background-color: darkgray;
  border-radius: 30px;
  padding: 5px;
  margin-left: 10px;
}

.minus-btn1 {
  padding: 3px 10px;
  color: white;
  background-color: firebrick;
  border: none;
  border-radius: 50%;
  font-size: 18px;
  margin-right: -5px;
}

.plus-btn1 {
  padding: 3px 10px;
  color: white;
  background-color: firebrick;
  border: none;
  border-radius: 50%;
  font-size: 18px;

}

.input-field1 {
  flex: 1;
  /* margin: 0 8px; */
  margin-left: 5px;
  margin-right: 10px;
  border: none;
  background-color: white;
  padding: 8px;
  border-radius: 30px;
}

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
  margin-top: 15px;
}

.section-divider4 {
  border-left: 5px solid rgb(16, 144, 161);
  padding-left: 10px;
  margin-top: 10px;
}

.section-title4 {
  display: inline-block;
  background-color: white;
  padding: 0 5px;
  position: relative;
  top: -10px;
  margin-top: 15px;
}
</style>