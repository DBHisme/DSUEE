import Vue from "vue";
import Vuex from "vuex";

Vue.use(Vuex);

const state = {
  update_interval: 1000 * 60 * 10,

  materialData: {
    actualData: {
      MQuicklime: 38.4,
      RatioCoke1: 58.0,
      RatioCoke2: 42.0,
      RatioOre1: 23.979,
      RatioOre2: 22.422,
      RatioOre3: 22.422,
      RatioOre4: 22.422,
      RatioOre5: 0.0,
      RatioOre6: 2.244,
      RatioOre7: 6.452,
    },
    param: {
      TFeSinter: 58.5,
      MgOSinter: 1.4,
      R2Sinter: 1.75,
      TSinter: 600.0,
      TMaterial: 60.0,
      H2O_1: 7.0,
      H2O_2: 7.5,
      ReturnSinter: 19.0,
      Loss_air: 40.0,
      DeS: 95.0,
      MBeddingLayer: 90.0,
      TBeddingLayer: 100.0,
      RCOG: 70.0,
      RBFG: 30.0,
      TGas: 400.0,
      RCOGas: 1.0,
      RFire_GasAir: 6.0,
      RTem_GasAir: 12.0,
      QFire: 70000.0,
      QTem: 10000.0,
      TCoke: 25.0,
      TFireAir: 25.0,
      TTemAir: 300.0,
      CoffExcess1: 1.8,
      TVentilation: 25.0,
      R_Loss0: 8.0,
      R_Rechot: 20.0,
    },
    ratioConvert: {
      coke: 0.8821,
      coal: 0.857,
      BFG: 0.0,
      COG: 0.643,
      electricity: 0.1129,
      water: 0.235,
      N2: 0.044,
      steam: 0.1057,
    },
    paramThermList: [
      {
        name: "CMixed",
        value: 0.891,
        annotation: "混合料的平均比热容",
      },
      {
        name: "CBeddingLayer",
        value: 0.8368,
        annotation: "铺底料的平均比热容",
      },
      {
        name: "CWater",
        value: 4.184,
        annotation: "水的平均比热容",
      },
      {
        name: "CFlue_gas",
        value: 1.436,
        annotation: "烟气的平均比热容",
      },
      {
        name: "CAir",
        value: 1.302,
        annotation: "空气的平均比热容",
      },
      {
        name: "CGas",
        value: 1.338,
        annotation: "煤气的平均比热容",
      },
      {
        name: "qFeS2",
        value: 6901.018,
        annotation: "生成1kgFeS2放热",
      },
      {
        name: "qFeO",
        value: 1952.06,
        annotation: "生成1kgFeO吸热",
      },
      {
        name: "qWater",
        value: 2487.1,
        annotation: "生成1kgH2O吸热",
      },
      {
        name: "qCaO",
        value: 3189.3,
        annotation: "生成1kgCaO吸热",
      },
      {
        name: "qMgO",
        value: 2516.4,
        annotation: "生成1kgMgO吸热",
      },
      {
        name: "pAir",
        value: 1.288,
        annotation: "空气密度",
      },
      {
        name: "pO2",
        value: 1.429,
        annotation: "氧气密度",
      },
    ],
  },
  theoryData: {
    TFe: 58.5,
    Tgas_end: 120,
    R2: 1.8,
    Tsolid_end: 600,
    Tsolid_start: 60,
    Tgas_start: 25,
  },
};

const mutations = {
  set(state, [variable, value]) {
    state[variable] = value;
  },
  setMaterialData(state, value) {
    state.materialData = value;
  },
  setBackendMaterialData(state, value) {
    state.materialData = value;
  },
  setTheoryData(state, value) {
    state.theoryData = value;
  },
  setBackendTheoryData(state, value) {
    state.theoryData = value;
  },
};
export default new Vuex.Store({
  state,
  mutations,
});
