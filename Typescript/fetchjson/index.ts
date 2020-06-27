import axios from 'axios';

const url = 'http://jsonplaceholder.typicode.com/todos/1';


interface Todo{

    // userId:number;
    id:number;
    title:string;
    completed:boolean;
}
axios.get(url).then(response => {
    // console.log(response.data);
    const todo = response.data as Todo;
    const id = todo.id;
    const title = todo.title;
    const completed = todo.completed;

    logTodo(id,title,completed)
    
})

const logTodo = (id:number,title:string,completed:boolean) =>{
    console.log(`
    The Todo with ID: ${id}
    Has a title of:${title}
    Is it finished?:${completed}
    `);
};