/*==============================================================*/
/* DBMS name:      MySQL 5.0                                    */
/* Created on:     2020/1/3 12:03:53                            */
/*==============================================================*/


drop table if exists t_product;

/*==============================================================*/
/* Table: t_product                                             */
/*==============================================================*/
create table t_product
(
   id                   varchar(50) not null comment '产品编号',
   name                 varchar(50) not null comment '产品名称',
   start_amount         decimal(15,3) not null comment '起投金额',
   step_amount          decimal(15,3) not null comment '投资步长',
   lockup_period        smallint not null comment '锁定期 以天为单位',
   earning_rate         decimal(5,3) not null comment '收益率 0-100 百分比',
   status               varchar(20) not null comment '状态 销售中 锁定 已结束',
   remark               varchar(200) comment '备注',
   create_at            datetime comment '创建时间',
   create_user          varchar(20) comment '产品创建者',
   update_at            datetime comment '产品更新时间',
   update_user          varchar(20) comment '产品更新者',
   primary key (id)
);

