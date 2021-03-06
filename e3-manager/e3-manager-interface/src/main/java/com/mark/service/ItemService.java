package com.mark.service;

import com.mark.commen.EasyUIDataGridResult;
import com.mark.pojo.TbItem;

/**
 * Created by mk on 2018/3/13.
 */
public interface ItemService {

    TbItem getItemById(long id);

    EasyUIDataGridResult getItemList(int page, int rows);

}
