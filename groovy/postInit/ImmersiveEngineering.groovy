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

// Multiblock Components

crafting.removeByOutput(item('immersiveengineering:metal_decoration0', 3))

crafting.addShaped(item('immersiveengineering:metal_decoration0', 3) * 2, [
    [ore('ingotIron'), ore('dustRedstone'), ore('ingotIron')],
    [ore('dustRedstone'), ore('ingotManasteel'), ore('dustRedstone')],
    [ore('ingotIron'), ore('dustRedstone'), ore('ingotIron')]
])

crafting.removeByOutput(item('immersiveengineering:metal_decoration0', 4))

crafting.addShaped(item('immersiveengineering:metal_decoration0', 4) * 2, [
    [ore('ingotIron'), ore('ingotManasteel'), ore('ingotIron')],
    [item('immersiveengineering:material', 8), ore('gearCopper'), item('immersiveengineering:material', 8)],
    [ore('ingotIron'), ore('ingotManasteel'), ore('ingotIron')]
])

crafting.removeByOutput(item('immersiveengineering:metal_decoration0', 5))

crafting.addShaped(item('immersiveengineering:metal_decoration0', 5) * 2, [
    [ore('ingotManasteel'), item('minecraft:piston'), ore('ingotManasteel')],
    [item('immersiveengineering:material', 9), ore('gearElectrum'), item('immersiveengineering:material', 9)],
    [ore('ingotManasteel'), item('minecraft:piston'), ore('ingotManasteel')]
])

// Lanterns

crafting.removeByOutput(item('immersiveengineering:metal_decoration2', 4))

crafting.addShaped(item('immersiveengineering:metal_decoration2', 4) * 2, [
    [null, ore('plateIron'), null],
    [item('botania:managlasspane'), ore('glowstone'), item('botania:managlasspane')],
    [null, ore('plateIron'), null]
])

crafting.removeByOutput(item('immersiveengineering:metal_device1', 4))

crafting.addShaped(item('immersiveengineering:metal_device1', 4) * 2, [
    [null, ore('plateSteel'), null],
    [item('botania:managlasspane'), ore('electronTube'), item('botania:managlasspane')],
    [null, ore('plateSteel'), null]
])

// Projector

crafting.removeByOutput(item('immersivepetroleum:schematic'))

crafting.addShaped(item('immersivepetroleum:schematic'), [
    [item('botania:managlass'), null, null],
    [ore('ingotManasteel'), item('immersiveengineering:metal_decoration2', 4), null],
    [null, ore('ingotManasteel'), ore('plankTreatedWood')]
])