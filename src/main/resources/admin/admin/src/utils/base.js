const base = {
    get() {
        return {
            url : "http://localhost:8080/springbootx1786/",
            name: "springbootx1786",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/springbootx1786/front/index.html'
        };
    },
    getProjectName(){
        return {
            projectName: "编程训练系统设计与实现"
        } 
    }
}
export default base
