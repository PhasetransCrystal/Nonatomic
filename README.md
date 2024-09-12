瓦解核心：非原子单位 | Brea:Nonatomic
=======

[here to read English version](README_en.md)

---

## 概述
Nonatomic Lib，它允许玩家在游戏中操控干员。干员是特殊的实体，玩家可以部署它们来执行各种任务。每个干员都有独特的属性和技能。

## 功能
- **干员系统**：玩家可以解锁、部署、回收干员。
- **干员类型**：多种干员类型，每种都有特定的属性和行为。
- **干员交互**：玩家可以与干员互动，包括登录、登出、刷新状态等。
- **干员属性**：干员具有可定制的属性，影响其在游戏中的表现。
- **事件监听**：模组监听游戏事件，如玩家登录、退出，以及干员的部署和回收。

## 代码框架

### 主要类和接口

- **Operator**：代表一个干员，包含干员的属性、状态和行为。
- **OperatorType**：定义干员的类型，每个类型都有创建干员实例的方法。
- **OpeHandler**：管理干员的接口，包括部署、回收和属性修改。
- **OperatorEntity**：干员在游戏中的实体表现。
- **OpeHandlerNoRepetition**：实现 `OpeHandler` 接口的具体类，管理玩家的干员部署。
- **IAttributesProvider**：提供干员属性的接口。

### 核心功能实现

- **干员创建与初始化**：通过 `OperatorType` 创建干员实例，并在 `OpeHandlerNoRepetition` 中管理。
- **干员部署与回收**：通过 `OpeHandler` 的实现来部署和回收干员，确保干员的状态同步。
- **属性管理**：通过 `IAttributesProvider` 接口来附加和移除干员的属性修改器。
- **事件监听**：通过 `GameBusConsumer` 类监听游戏事件，并根据事件来管理干员的行为。

### 事件与监听

- **玩家事件**：监听玩家的登录、登出、死亡和维度变化事件。
- **干员事件**：处理干员的部署、回收和伤害事件。

### 注册与管理

- **Registries**：管理干员信息和类型的注册表。
- **ModBusConsumer**：在模组事件总线上注册干员信息和类型。

## 贡献

欢迎对Nonatomic模组进行贡献。你可以提交Issues来报告问题，或者Fork本项目来提交你的改进。

## 开发者

- **Mon-landis**：提供技术支持和开发。

---

