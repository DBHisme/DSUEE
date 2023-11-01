import Vue from "vue";
import VueRouter from "vue-router";
import dataV from "@jiaminghi/data-view";

Vue.use(VueRouter);
Vue.use(dataV);

const TheContainer = () => import("@/containers/TheContainer");
const SinterRealtime = () => import("@/views/sinter-realtime/index.vue");
const MaterialComposition = () =>
  import("@/views/material-composition/index.vue");
const ProcedureParam = () => import("@/views/procedure-param/index.vue");
const EnergyEfficiency = () => import("@/views/energy-efficiency/index.vue");
const HistoricalCase = () => import("@/views/historical-case/index.vue");
const SearchEngine = () => import("@/views/search-engine/index.vue");

const router = new VueRouter({
  mode: "hash",
  base: process.env.BASE_URL,
  routes: configRoutes(),
});

router.beforeEach((to, from, next) => {
  /* 路由发生变化修改页面title */
  if (to.meta.title) {
    document.title = to.meta.title;
  }
  next();
});

export default router;

function configRoutes() {
  return [
    {
      path: "/",
      redirect: "/sinter-realtime",
      name: "Home",
      component: TheContainer,
      children: [
        {
          path: "sinter-realtime",
          name: "sinterRealtime",
          component: SinterRealtime,
          meta: {
            title: "机械臂控制界面",
          },
        },
        {
          path: "material-composition",
          name: "materialComposition",
          component: MaterialComposition,
          meta: {
            title: "视觉抓取界面",
          },
        },
        {
          path: "procedure-param",
          name: "procedureParam",
          component: ProcedureParam,
          meta: {
            title: "界面3",
          },
        },
        {
          path: "energy-efficiency",
          name: "energyEfficiency",
          component: EnergyEfficiency,
          meta: {
            title: "界面4",
          },
        },
        {
          path: "historical-case",
          name: "historicalCase",
          component: HistoricalCase,
          meta: {
            title: "界面5",
          },
        },
        {
          path: "search-engine",
          name: "searchEngine",
          component: SearchEngine,
          meta: {
            title: "界面6",
          },
        },
      ],
    },
  ];
}
