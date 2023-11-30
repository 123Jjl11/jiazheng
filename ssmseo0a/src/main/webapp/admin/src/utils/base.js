const base = {
    get() {
                return {
            url : "http://localhost:8080/ssmseo0a/",
            name: "ssmseo0a",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/ssmseo0a/front/index.html'
        };
            },
    getProjectName(){
        return {
            projectName: "家政服务管理系统"
        } 
    }
}
export default base
