module.exports = {
  lintOnSave: false,
  publicPath: "./",
  devServer: {
    proxy: {
      "/Actual": {
        target: "http://127.0.0.1:8888",
        ws: true,
        changeOrigin: true,
      },
      "/Theory": {
        target: "http://127.0.0.1:8888",
        ws: true,
        changeOrigin: true,
      },
      "/Tech": {
        target: "http://127.0.0.1:8888",
        ws: true,
        changeOrigin: true,
      },
    },
  },
};
