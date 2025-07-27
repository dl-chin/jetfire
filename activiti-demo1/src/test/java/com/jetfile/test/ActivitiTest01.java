package com.jetfile.test;

import org.activiti.engine.*;
import org.junit.Test;

public class ActivitiTest01 {


    /**
     * 创建 activiti 流程引擎实例, 并创建activiti数据表
     */
    @Test
    public void getProcessEngine() {
        // 方式一：工具类ProcessEngines获取流程引擎实例
        // 核心配置文件中 id 必须为 processEngineConfiguration
         ProcessEngine processEngine = ProcessEngines.getDefaultProcessEngine();

        // 方式二：等同于上面方式一
        /*ProcessEngineConfiguration configuration = ProcessEngineConfiguration.createProcessEngineConfigurationFromResourceDefault();
        ProcessEngine processEngine1 = configuration.buildProcessEngine();*/

        // 方式三：指定特定名字的核心配置文件
        /*ProcessEngineConfiguration configuration = ProcessEngineConfiguration
                .createProcessEngineConfigurationFromResource("activiti2.cfg.xml");
        ProcessEngine processEngine1 = configuration.buildProcessEngine();*/

        // 方式四：指定特定名字的核心配置文件，和特定的beanName
//        ProcessEngineConfiguration configuration = ProcessEngineConfiguration
//                .createProcessEngineConfigurationFromResource("activiti2.cfg.xml", "processEngineConfiguration22");
//        ProcessEngine processEngine1 = configuration.buildProcessEngine();

        System.out.println("processEngine: " + processEngine);
    }
}