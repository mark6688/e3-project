package com.mark.service.impl;

import com.mark.commen.EasyUITreeNode;
import com.mark.mapper.TbItemCatMapper;
import com.mark.pojo.TbItemCat;
import com.mark.pojo.TbItemCatExample;
import com.mark.service.ItemCatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by mk on 2018/4/17.
 */
@Service
public class ItemCatServiceImpl implements ItemCatService {

    @Autowired
    private TbItemCatMapper itemCatMapper;

    /**
     * 根据parentId查询
     * @param parentId
     * @return
     */
    @Override
    public List<EasyUITreeNode> getCatList(Long parentId) {
        //1.根据parentId查询节点列表
        TbItemCatExample example = new TbItemCatExample();
        //设置查询条件
        TbItemCatExample.Criteria criteria = example.createCriteria();
        criteria.andParentIdEqualTo(parentId);
        List<TbItemCat> list = itemCatMapper.selectByExample(example);
        //2.转换成EasyUITreenode
        List<EasyUITreeNode> resultList = new ArrayList <>();
        for (TbItemCat tbItemCat:list) {
            EasyUITreeNode node = new EasyUITreeNode();
            node.setId(tbItemCat.getId());
            node.setText(tbItemCat.getName());
            node.setState(tbItemCat.getIsParent()?"closed":"open");
            //添加到列表
            resultList.add(node);
        }
        //3.返回
        return resultList;
    }
}
