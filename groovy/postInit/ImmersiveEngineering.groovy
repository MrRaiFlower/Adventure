// Engineer's Tools

crafting.removeByOutput(item('immersiveengineering:tool'))

crafting.addShaped(item('immersiveengineering:tool'), [
    [null, ore('ingotManasteel'), ore('manaString')],
    [null, ore('livingwoodTwig'), ore('ingotManasteel')],
    [ore('livingwoodTwig'), null, null]
])

crafting.removeByOutput(item('immersiveengineering:tool', 1))

crafting.addShaped(item('immersiveengineering:tool', 1), [
    [ore('livingwoodTwig'), ore('ingotManasteel')],
    [null, ore('livingwoodTwig')]
])

// Reinforced Blast Brick

crafting.removeByOutput(item('immersiveengineering:stone_decoration', 2))

crafting.addShaped(item('immersiveengineering:stone_decoration', 2), [
    [null, ore('ingotManasteel'), null],
    [ore('plateSteel'), item('immersiveengineering:stone_decoration', 1), ore('plateSteel')],
    [null, ore('ingotManasteel'), null]
])

// Insulating Glass

crafting.removeByOutput(item('immersiveengineering:stone_decoration', 8))

crafting.addShaped(item('immersiveengineering:stone_decoration', 8) * 2, [
    [null, item('botania:managlass'), null],
    [ore('dustIron'), ore('dyeGreen'), ore('dustIron')],
    [null, item('botania:managlass'), null]
])