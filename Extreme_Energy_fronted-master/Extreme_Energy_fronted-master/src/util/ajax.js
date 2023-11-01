import Axios from 'axios'

// 请求基地址
const BASEURL = 'http://localhost:8080'

// url 是BASEURL后面跟的地址 param是要传的参数对象{params: {}}
export function ajaxRequest(url, param) {

	return new Promise( (resolve, reject) => {
		Axios.get(BASEURL+url, param)
      .then((res) => {
        resolve(res)
      })
      .catch((err) => {
        reject(err)  
      })
	})
}

export function ajaxPost(url,param) {
  return new Promise( (resolve,reject) =>{
    Axios.post(BASEURL + url, param)
    .then( (res) => {
      resolve(res)
    })
    .catch( (err) =>{
      reject(err)
    })
  })
}
