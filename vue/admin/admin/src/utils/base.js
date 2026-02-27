const base = {
    get() {
        return {
            url : "http://localhost:8080/springboot3258n/",
            name: "springboot3258n",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/springboot3258n/front/dist/index.html'
        };
    },
    getProjectName(){
        return {
            projectName: "餐厅点餐系统"
        } 
    }
}
export default base
