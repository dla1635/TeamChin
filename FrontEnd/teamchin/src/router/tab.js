import TabPage from '@/pages/TabPage'
import HomePage from '@/pages/HomePage'
import TodoPage from '@/pages/TodoPage'
import chatPage from '@/pages/ChatPage'
import BoardPage from '@/pages/BoardPage'
import CalendarPage from '@/pages/CalendarPage'

export default {
    path: '/:U_id/:T_id',
    name: 'Tab',
    component:TabPage,
    children: [
        {
            path:'home',
            component:HomePage
        },
        {
            path:'todo',
            component:TodoPage
        },
        {
            path:'chat',
            component:chatPage
        } ,
        {
            path:'board',
            component:BoardPage
        } ,
        {
            path:'calendar',
            component:CalendarPage
        }  
    ],
}