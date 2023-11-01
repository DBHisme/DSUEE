(window["webpackJsonp"]=window["webpackJsonp"]||[]).push([["chunk-0442b60c"],{"075b":function(a,t,e){},"394d":function(a,t,e){"use strict";e("075b")},"7b13":function(a,t,e){"use strict";e.r(t);var i=function(){var a=this,t=a.$createElement,e=a._self._c||t;return e("div",{staticClass:"container"},[e("div",{staticClass:"info-container"},[e("div",{staticClass:"mix-info1 left-align"},[e("div",{staticClass:"info-heading-container"},[e("h2",{staticClass:"info-heading"},[a._v("混合矿信息")]),e("button",{staticClass:"button-left",on:{click:function(t){return a.saveToMaterialData()}}},[a._v("保存")]),e("button",{staticClass:"button-right",on:{click:function(t){return a.pos()}}},[a._v("提交")])]),e("div",{staticClass:"info-content yellow-border"},[e("table",[a._m(0),e("tbody",a._l(a.ores,(function(t){return e("tr",{key:t.id},[e("td",[a._v(a._s(t.name))]),e("td",[e("input",{directives:[{name:"model",rawName:"v-model",value:t.ratio,expression:"ore.ratio"}],staticClass:"custom-input",attrs:{type:"text"},domProps:{value:t.ratio},on:{input:function(e){e.target.composing||a.$set(t,"ratio",e.target.value)}}})])])})),0)])])]),e("div",{staticClass:"mix-info2 left-align"},[e("h2",{staticClass:"info-heading"},[a._v("混合燃料信息")]),e("div",{staticClass:"info-content yellow-border"},[e("table",[a._m(1),e("tbody",a._l(a.fuels,(function(t){return e("tr",{key:t.id},[e("td",[a._v(a._s(t.name))]),e("td",[e("input",{directives:[{name:"model",rawName:"v-model",value:t.ratio,expression:"fuel.ratio"}],staticClass:"custom-input",attrs:{type:"text"},domProps:{value:t.ratio},on:{input:function(e){e.target.composing||a.$set(t,"ratio",e.target.value)}}})])])})),0)])])]),e("div",{staticClass:"mix-info3 left-align"},[e("h2",{staticClass:"info-heading"},[a._v("混合熔剂信息")]),e("div",{staticClass:"info-content yellow-border"},[e("table",[a._m(2),e("tbody",a._l(a.fluxes,(function(t){return e("tr",{key:t.id},[e("td",[a._v(a._s(t.name))]),e("td",[e("input",{directives:[{name:"model",rawName:"v-model",value:t.ratio,expression:"flux.ratio"}],staticClass:"custom-input",attrs:{type:"text"},domProps:{value:t.ratio},on:{input:function(e){e.target.composing||a.$set(t,"ratio",e.target.value)}}})])])})),0)])])])]),a._m(3)])},r=[function(){var a=this,t=a.$createElement,e=a._self._c||t;return e("thead",[e("tr",[e("th",[a._v("名称")]),e("th",{staticClass:"ratio-header"},[a._v("配比%")])])])},function(){var a=this,t=a.$createElement,e=a._self._c||t;return e("thead",[e("tr",[e("th",[a._v("名称")]),e("th",{staticClass:"ratio-header"},[a._v("配比%")])])])},function(){var a=this,t=a.$createElement,e=a._self._c||t;return e("thead",[e("tr",[e("th",[a._v("名称")]),e("th",{staticClass:"ratio-header"},[a._v("质量")])])])},function(){var a=this,t=a.$createElement,e=a._self._c||t;return e("div",[e("div",{staticClass:"chartContainer1",attrs:{id:"chartContainer"}}),e("div",{staticClass:"chartContainer2",attrs:{id:"chartContainer2"}})])}],u=(e("b0c0"),e("a9e3"),e("b680"),e("ac1f"),e("466d"),e("2b0e")),o=e("bc3a"),s=e.n(o),l=e("313e"),c={name:"PieChart",data:function(){return{chartData1:[],H2O:100,FeO:100,Fe2O3:100,CaO:100,MgO:100,SiO2:100,Al2O3:100,FeS2:100,Rest:100,C:100,Loss:100,chartData2:[],H2O_:100,FeO_:100,Fe2O3_:100,CaO_:100,MgO_:100,SiO2_:100,Al2O3_:100,FeS2_:100,Rest_:100,Cfix_:100,Vol_:100,ores:[{id:1,name:"矿粉A",ratio:"",backendName:"ROre1"},{id:2,name:"矿粉B",ratio:"",backendName:"ROre2"},{id:3,name:"矿粉C",ratio:"",backendName:"ROre3"},{id:4,name:"矿粉D",ratio:"",backendName:"ROre4"},{id:5,name:"矿粉E",ratio:"",backendName:"ROre5"},{id:6,name:"矿粉F",ratio:"",backendName:"ROre6"},{id:7,name:"矿粉G ",ratio:"",backendName:"ROre7"}],fuels:[{id:1,name:"焦粉A",ratio:"",backendName:"RCoke1"},{id:2,name:"焦粉B",ratio:"",backendName:"RCoke2"}],fluxes:[{id:3,name:"生石灰",ratio:"",backendName:"MQuicklime"}]}},methods:{renderChart:function(){var a=document.getElementById("chartContainer2"),t=l["init"](a),e=document.getElementById("chartContainer"),i=l["init"](e),r={chart:{width:"1200px",height:"1000px"},series:[{name:"访问来源",type:"pie",radius:"40%",center:["50%","60%"],label:{formatter:"{b}: {c} ({d}%)"},emphasis:{label:{show:!0,fontSize:"12",fontWeight:"bold"}},data:this.chartData1}],left:400,top:500},u={chart:{width:"1200px",height:"1000px"},series:[{name:"等待数据",type:"pie",radius:"40%",center:["50%","60%"],label:{formatter:"{b}: {c} ({d}%)"},emphasis:{label:{show:!0,fontSize:"12",fontWeight:"bold"}},data:this.chartData2}],left:200,top:500};i.setOption(r),t.setOption(u)},searchInBackendReturnData:function(a,t){for(var e=0;e<a.length;e++)for(var i=a[e],r=0;r<t.length;r++){var u=0;if(u=void 0!=i.backendName?t[r].name==i.backendName:t[r].annotation.match(i.label),u){i.ratio=t[r].parameter;break}}},initializeChartData:function(){this.chartData1=[{value:this.H2O,name:"H2O"},{value:this.FeO,name:"FeO"},{value:this.Fe2O3,name:"Fe2O3"},{value:this.CaO,name:"CaO"},{value:this.MgO,name:"MgO"},{value:this.SiO2,name:"SiO2"},{value:this.Al2O3,name:"Al2O3"},{value:this.FeS2,name:"FeS2"},{value:this.Rest,name:"Rest"},{value:this.C,name:"C"},{value:this.Loss,name:"Loss"}],this.chartData2=[{value:this.H2O_,name:"H2O_"},{value:this.FeO_,name:"FeO_"},{value:this.Fe2O3_,name:"Fe2O3_"},{value:this.CaO_,name:"CaO_"},{value:this.MgO_,name:"MgO_"},{value:this.SiO2_,name:"SiO2_"},{value:this.Al2O3_,name:"Al2O3_"},{value:this.FeS2_,name:"FeS2_"},{value:this.Rest_,name:"Rest_"},{value:this.Cfix_,name:"Cfix_"},{value:this.Vol_,name:"Vol_"}]},updateChartData:function(){u["default"].set(this.chartData1,0,{value:this.H2O,name:"H2O"}),u["default"].set(this.chartData1,1,{value:this.FeO,name:"FeO"}),u["default"].set(this.chartData1,2,{value:this.Fe2O3,name:"Fe2O3"}),u["default"].set(this.chartData1,3,{value:this.CaO,name:"CaO"}),u["default"].set(this.chartData1,4,{value:this.MgO,name:"MgO"}),u["default"].set(this.chartData1,5,{value:this.SiO2,name:"SiO2"}),u["default"].set(this.chartData1,6,{value:this.Al2O3,name:"Al2O3"}),u["default"].set(this.chartData1,7,{value:this.FeS2,name:"FeS2"}),u["default"].set(this.chartData1,8,{value:this.Rest,name:"Rest"}),u["default"].set(this.chartData1,9,{value:this.C,name:"C"}),u["default"].set(this.chartData1,10,{value:this.Loss,name:"Loss"}),u["default"].set(this.chartData2,0,{value:this.H2O_,name:"H2O_"}),u["default"].set(this.chartData2,1,{value:this.FeO_,name:"FeO_"}),u["default"].set(this.chartData2,2,{value:this.Fe2O3_,name:"Fe2O3_"}),u["default"].set(this.chartData2,3,{value:this.CaO_,name:"CaO_"}),u["default"].set(this.chartData2,4,{value:this.MgO_,name:"MgO_"}),u["default"].set(this.chartData2,5,{value:this.SiO2_,name:"SiO2_"}),u["default"].set(this.chartData2,6,{value:this.Al2O3_,name:"Al2O3_"}),u["default"].set(this.chartData2,7,{value:this.FeS2_,name:"FeS2_"}),u["default"].set(this.chartData2,8,{value:this.Rest_,name:"Rest_"}),u["default"].set(this.chartData2,9,{value:this.Cfix_,name:"Cfix_"}),u["default"].set(this.chartData2,10,{value:this.Vol_,name:"Vol_"}),this.initializeChartData(),console.log(this.chartData1);var a=document.getElementById("chartContainer"),t=l["init"](a),e=document.getElementById("chartContainer2"),i=l["init"](e),r={chart:{width:"120px",height:"100px"},series:[{name:"访问来源",type:"pie",radius:"40%",center:["50%","60%"],label:{formatter:"{b}: {c} ({d}%)"},emphasis:{label:{show:!0,fontSize:"12",fontWeight:"bold"}},data:this.chartData1}],left:400,top:500},o={chart:{width:"1200px",height:"1000px"},series:[{name:"等待数据",type:"pie",radius:"40%",center:["50%","60%"],label:{formatter:"{b}: {c} ({d}%)"},emphasis:{label:{show:!0,fontSize:"12",fontWeight:"bold"}},data:this.chartData2}],left:200,top:500};t.setOption(r),i.setOption(o)},saveToMaterialData:function(){var a=this.$store.state.materialData;a.actualData.RatioOre1=this.ores[0].ratio,a.actualData.RatioOre2=this.ores[1].ratio,a.actualData.RatioOre3=this.ores[2].ratio,a.actualData.RatioOre4=this.ores[3].ratio,a.actualData.RatioOre5=this.ores[4].ratio,a.actualData.RatioOre6=this.ores[5].ratio,a.actualData.RatioOre7=this.ores[6].ratio,a.actualData.RatioCoke1=this.fuels[0].ratio,a.actualData.RatioCoke2=this.fuels[1].ratio,a.actualData.MQuicklime=this.fluxes[0].ratio,Number(a.actualData.RatioOre1)+Number(a.actualData.RatioOre2)+Number(a.actualData.RatioOre3)+Number(a.actualData.RatioOre4)+Number(a.actualData.RatioOre5)+Number(a.actualData.RatioOre6)+Number(a.actualData.RatioOre7)!==100||Number(a.actualData.RatioCoke1)+Number(a.actualData.RatioCoke2)!==100?(alert("ores和fuels的比例总和不等于100，请检查数据。"),console.log(a.actualData.RatioOre1+a.actualData.RatioOre2+a.actualData.RatioOre3+a.actualData.RatioOre4+a.actualData.RatioOre5+a.actualData.RatioOre6+a.actualData.RatioOre7)):this.$store.commit("setMaterialData",a),this.H2O=7.96*Number(a.actualData.RatioOre1)+7.82*Number(a.actualData.RatioOre2)+7.89*Number(a.actualData.RatioOre3)+7.99*Number(a.actualData.RatioOre4)+.99*Number(a.actualData.RatioOre5),this.FeO=85.341*Number(a.actualData.RatioOre1)+84.867*Number(a.actualData.RatioOre2)+85.121*Number(a.actualData.RatioOre3)+84.776*Number(a.actualData.RatioOre4)+53.437*Number(a.actualData.RatioOre5)+76.097*Number(a.actualData.RatioOre6)+.886*Number(a.actualData.RatioOre7),this.Fe2O3=1.6*Number(a.actualData.RatioOre1)+2.14*Number(a.actualData.RatioOre2)+1.59*Number(a.actualData.RatioOre3)+2.04*Number(a.actualData.RatioOre4)+3.47*Number(a.actualData.RatioOre5)+7.01*Number(a.actualData.RatioOre6)+71.13*Number(a.actualData.RatioOre7),this.CaO=.46*Number(a.actualData.RatioOre1)+.71*Number(a.actualData.RatioOre2)+.62*Number(a.actualData.RatioOre3)+.63*Number(a.actualData.RatioOre4)+7.87*Number(a.actualData.RatioOre5)+7.87*Number(a.actualData.RatioOre6)+0*Number(a.actualData.RatioOre7),this.MgO=.19*Number(a.actualData.RatioOre1)+.21*Number(a.actualData.RatioOre2)+.21*Number(a.actualData.RatioOre3)+.21*Number(a.actualData.RatioOre4)+1.13*Number(a.actualData.RatioOre5)+1.51*Number(a.actualData.RatioOre6)+0*Number(a.actualData.RatioOre7),this.SiO2=4.25*Number(a.actualData.RatioOre1)+4.27*Number(a.actualData.RatioOre2)+4.28*Number(a.actualData.RatioOre3)+4.26*Number(a.actualData.RatioOre4)+4.87*Number(a.actualData.RatioOre5)+5.11*Number(a.actualData.RatioOre6)+1.73*Number(a.actualData.RatioOre7),this.Al2O3=1.48*Number(a.actualData.RatioOre1)+1.45*Number(a.actualData.RatioOre2)+1.47*Number(a.actualData.RatioOre3)+1.47*Number(a.actualData.RatioOre4)+1.96*Number(a.actualData.RatioOre5)+1.85*Number(a.actualData.RatioOre6)+0*Number(a.actualData.RatioOre7),this.FeS2=.036*Number(a.actualData.RatioOre1)+.039*Number(a.actualData.RatioOre2)+.039*Number(a.actualData.RatioOre3)+.043*Number(a.actualData.RatioOre4)+.548*Number(a.actualData.RatioOre5)+.021*Number(a.actualData.RatioOre6)+.186*Number(a.actualData.RatioOre7),this.Rest=.35*Number(a.actualData.RatioOre1)+.318*Number(a.actualData.RatioOre2)+.644*Number(a.actualData.RatioOre3)+.38*Number(a.actualData.RatioOre4)+.077*Number(a.actualData.RatioOre5)+.064*Number(a.actualData.RatioOre6)+22.094*Number(a.actualData.RatioOre7),this.C=0*Number(a.actualData.RatioOre1)+0*Number(a.actualData.RatioOre2)+0*Number(a.actualData.RatioOre3)+0*Number(a.actualData.RatioOre4)+26.39*Number(a.actualData.RatioOre5)+0*Number(a.actualData.RatioOre6)+0*Number(a.actualData.RatioOre7),this.Loss=5.88*Number(a.actualData.RatioOre1)+5.59*Number(a.actualData.RatioOre2)+5.62*Number(a.actualData.RatioOre3)+5.78*Number(a.actualData.RatioOre4)+26.39*Number(a.actualData.RatioOre5)+0*Number(a.actualData.RatioOre6)+3.785*Number(a.actualData.RatioOre7),this.H2O_=5.5*Number(a.actualData.RatioCoke1)+4.92*Number(a.actualData.RatioCoke2),this.FeO_=1.211*Number(a.actualData.RatioCoke1)+.858*Number(a.actualData.RatioCoke2),this.Fe2O3_=5.5*Number(a.actualData.RatioCoke1)+4.92*Number(a.actualData.RatioCoke2),this.CaO_=5.5*Number(a.actualData.RatioCoke1)+4.92*Number(a.actualData.RatioCoke2),this.MgO_=5.5*Number(a.actualData.RatioCoke1)+4.92*Number(a.actualData.RatioCoke2),this.SiO2_=5.5*Number(a.actualData.RatioCoke1)+4.92*Number(a.actualData.RatioCoke2),this.Al2O3_=5.5*Number(a.actualData.RatioCoke1)+4.92*Number(a.actualData.RatioCoke2),this.FeS2_=5.5*Number(a.actualData.RatioCoke1)+4.92*Number(a.actualData.RatioCoke2),this.Rest_=5.5*Number(a.actualData.RatioCoke1)+4.92*Number(a.actualData.RatioCoke2),this.Cfix_=5.5*Number(a.actualData.RatioCoke1)+4.92*Number(a.actualData.RatioCoke2),this.Vol_=5.5*Number(a.actualData.RatioCoke1)+4.92*Number(a.actualData.RatioCoke2),this.H2O=this.H2O.toFixed(2),this.FeO=this.FeO.toFixed(2),this.Fe2O3=this.Fe2O3.toFixed(2),this.CaO=this.CaO.toFixed(2),this.MgO=this.MgO.toFixed(2),this.SiO2=this.SiO2.toFixed(2),this.Al2O3=this.Al2O3.toFixed(2),this.FeS2=this.FeS2.toFixed(2),this.Rest=this.Rest.toFixed(2),this.C=this.C.toFixed(2),this.Loss=this.Loss.toFixed(2),this.H2O_=this.H2O_.toFixed(2),this.FeO_=this.FeO_.toFixed(2),this.Fe2O3_=this.Fe2O3_.toFixed(2),this.CaO_=this.CaO_.toFixed(2),this.MgO_=this.MgO_.toFixed(2),this.SiO2_=this.SiO2_.toFixed(2),this.Al2O3_=this.Al2O3_.toFixed(2),this.FeS2_=this.FeS2_.toFixed(2),this.Rest_=this.Rest_.toFixed(2),this.Cfix_=this.Cfix_.toFixed(2),this.Vol_=this.Vol_.toFixed(2),this.updateChartData()},pos:function(){this.$router.push("procedure-param")}},mounted:function(){this.initializeChartData(),this.updateChartData(),this.renderChart()},created:function(){var a=this;s.a.post("/Actual/getActualParameter").then((function(t){a.flag=t.data.flag,a.searchInBackendReturnData(a.ores,t.data),a.searchInBackendReturnData(a.fuels,t.data),a.searchInBackendReturnData(a.fluxes,t.data),console.log(a.ores)})).catch((function(a){console.error(a)}))}},n=c,h=(e("394d"),e("2877")),m=Object(h["a"])(n,i,r,!1,null,"4d948b4a",null);t["default"]=m.exports}}]);
//# sourceMappingURL=chunk-0442b60c.1dd68e19.js.map