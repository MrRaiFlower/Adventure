// Crafting Table

crafting.removeByOutput(item('minecraft:crafting_table'))

crafting.addShaped(item('minecraft:crafting_table'), [
    [ore('plankWood'), ore('plankWood')],
    [ore('logWood'), ore('logWood')]
])

// Chest

crafting.removeByOutput(item('minecraft:chest'))

crafting.addShaped(item('minecraft:chest'), [
    [ore('logWood'), ore('plankWood'), ore('logWood')],
    [ore('plankWood'), ore('ingotIron'), ore('plankWood')],
    [ore('logWood'), ore('plankWood'), ore('logWood')]
])

// Hopper

crafting.removeByOutput(item('minecraft:hopper'))

crafting.addShaped(item('minecraft:hopper'), [
    [ore('plateIron'), null, ore('plateIron')],
    [ore('plateIron'), item('minecraft:chest'), ore('plateIron')],
    [null, ore('plateIron'), null]
])

// Cauldron

crafting.removeByOutput(item('minecraft:cauldron'))

crafting.addShaped(item('minecraft:cauldron'), [
    [ore('plateIron'), null, ore('plateIron')],
    [ore('plateIron'), null, ore('plateIron')],
    [ore('plateIron'), ore('plateIron'), ore('plateIron')]
])

// Bucket

crafting.removeByOutput(item('minecraft:bucket'))

crafting.addShaped(item('minecraft:bucket'), [
    [ore('plateIron'), null, ore('plateIron')],
    [null, ore('plateIron'), null]
])

// Piston

crafting.removeByOutput(item('minecraft:piston'))

crafting.addShaped(item('minecraft:piston'), [
    [ore('plankWood'), ore('plankWood'), ore('plankWood')],
    [ore('dustRedstone'), ore('stickSteel'), ore('dustRedstone')],
    [ore('cobblestone'), ore('plateSteel'), ore('cobblestone')]
])

// Enchantment Table

crafting.removeByOutput(item('minecraft:enchanting_table'))

crafting.addShaped(item('minecraft:enchanting_table'), [
    [null, item('minecraft:book'), null],
    [ore('manaDiamond'), ore('obsidian'), ore('manaDiamond')],
    [ore('obsidian'), ore('obsidian'), ore('obsidian')]
])