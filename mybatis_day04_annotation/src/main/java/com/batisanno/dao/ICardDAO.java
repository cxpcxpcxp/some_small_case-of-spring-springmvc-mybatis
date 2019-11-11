package com.batisanno.dao;

import com.batisanno.pojo.Card;
import org.apache.ibatis.annotations.Select;

public interface ICardDAO {
    @Select("select * from cardtb where id=#{cid}")
    public Card findById(int cid);
}
