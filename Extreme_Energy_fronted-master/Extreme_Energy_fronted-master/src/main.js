import Vue from "vue";
import App from "./App.vue";
import store from "./store";
import axios from "axios";
import VueAxios from "vue-axios";
import vuescroll from "vuescroll";
import router from "./router";
import ElementUI from "element-ui";
import qs from "qs";
import VueSession from "vue-session";

import "element-ui/lib/theme-chalk/index.css";
import "@babel/polyfill";
import "mutationobserver-shim";
import "vuescroll/dist/vuescroll.css";
import "./plugins/bootstrap-vue";

Vue.use(VueAxios, axios);
Vue.use(require("vue-moment"));
Vue.use(vuescroll);
Vue.use(ElementUI);
Vue.use(qs);
Vue.use(VueSession);

Vue.prototype.$qs = qs;

Vue.config.productionTip = false;

new Vue({
  router,
  store,
  render: (h) => h(App),
}).$mount("#app");
