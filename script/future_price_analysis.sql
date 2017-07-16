-- 1.期货每日价格表(ID,合约名称,开盘价,收盘价,最高价,最低价,结算价,K线类型,星期数,持仓量,成交量,价差1(开收价差),价差2(最高最低价差))
CREATE TABLE future_daily_price (
  `id`                   BIGINT       NOT NULL AUTO_INCREMENT,
  `contract_code`        VARCHAR(50)  NOT NULL COMMENT '合约CODE',
  `date`                 DATETIME     NOT NULL COMMENT '日期yyyy-mm-dd',
  `opening_price`        SMALLINT     NOT NULL COMMENT '开盘价',
  `closing_price`        SMALLINT     NOT NULL COMMENT '收盘价',
  `the_highest_price`    SMALLINT     NOT NULL COMMENT '最高价',
  `the_lowest_price`     SMALLINT     NOT NULL COMMENT '最低价',
  `average_price`        SMALLINT     NOT NULL COMMENT '结算价(日成交均价)',
  `open_interest`        INT          NOT NULL COMMENT '持仓量',
  `volume`               INT          NOT NULL COMMENT '成交量',
  `oc_spread`            SMALLINT     NOT NULL COMMENT '价差(开盘收盘)',
  `hl_spread`            SMALLINT     NOT NULL COMMENT '价差(最高最低)',
  `created_at`           DATETIME     NOT NULL DEFAULT CURRENT_TIMESTAMP   COMMENT '创建时间',
  `updated_at`           DATETIME     COMMENT '更新时间',
  PRIMARY KEY (id),
  UNIQUE KEY `unique_key_date_contract` (`date`,`contract_code`)
)
  ENGINE = INNODB
  AUTO_INCREMENT = 1
  DEFAULT CHARSET = utf8
  COMMENT = '期货每日价格表';


