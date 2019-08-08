import PostDetailPage from '@/pages/PostDetailPage'
import BoardDetail from '@/components/BoardDetail'
import NoticeDetail from '@/components/NoticeDetail'

export default {
  path: '/',
  name: 'Detail',
  component: PostDetailPage,
  children: [
      {
        path: '/board/detail',
        name: 'BoardDetail',
        component: BoardDetail
      },
      {
        path: '/notice/detail',
        name: 'NoticeDetail',
        component: NoticeDetail
      },
  ]
}
