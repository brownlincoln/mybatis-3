package com.chris.limit;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface CustomerMapper {
	List<Customer> selectUsersDiscount(@Param("discount") double discount, @Param("offset") int offset, @Param("pageSize") int pageSize);
}
