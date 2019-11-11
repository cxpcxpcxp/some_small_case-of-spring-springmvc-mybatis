根据id查询
vo对象为list的int集合
<select id="findUserById" resultType="User" parameterType="UserIdVo">
dao接口里面需要返回List 参数为vo对象