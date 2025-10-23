// Blast Brick

crafting.removeByOutput(item('immersiveengineering:stone_decoration', 1))

crafting.addShaped(item('immersiveengineering:stone_decoration', 1) * 3, [
    [ore('ingotBrickNether'), ore('ingotBrick'), ore('ingotBrickNether')],
    [ore('ingotBrick'), item('minecraft:magma_cream'), ore('ingotBrick')],
    [ore('ingotBrickNether'), ore('ingotBrick'), ore('ingotBrickNether')]
])