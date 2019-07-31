package com.dst.listTotree.model;


import java.util.List;

/**
 * tree结构模型，可以通过添加属性进行定制
 * @denny
 */
public class TreeModel {


    private List<TreeModel> nodes;
    private String id;
    private String name;
    private String pid;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPid() {
        return pid;
    }

    public void setPid(String pid) {
        this.pid = pid;
    }
    //    private Tree detail;
//
//    public Tree getDetail() {
//        return detail;
//    }
//
//    public void setDetail(Tree detail) {
//        this.detail = detail;
//    }

    public TreeModel() {
    }

    public List<TreeModel> getNodes() {
        return nodes;
    }

    public void setNodes(List<TreeModel> nodes) {
        this.nodes = nodes;
    }


}
