# 外观模式（门面模式）

> 实用度：3<br />
> 常见度：5

外观模式是把子系统的灵活和复杂用一种外观固定下来，一般来说可以看做是一种有损的封装，损失的是外部系统不需要的灵活度。

目的：隐藏复杂度，保持对外部系统的简洁，方便他人使用

已有的实现：由于子系统都是由自己开发，因此没有通用的外观模式。

缺点：隐藏了灵活性，如果外部系统需要更多的功能，需要修改facade。
