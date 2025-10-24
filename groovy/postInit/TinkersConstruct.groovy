// Blank Pattern

crafting.removeByOutput(item('tconstruct:pattern'))

crafting.addShaped(item('tconstruct:pattern') * 2, [
    [ore('plankWood'), ore('stickWood')],
    [ore('stickWood'), ore('plankWood')]
])

crafting.addShaped(item('tconstruct:pattern') * 2, [
    [ore('stickWood'), ore('plankWood')],
    [ore('plankWood'), ore('stickWood')]
])

// Smeltery Controller

crafting.removeByOutput(item('tconstruct:smeltery_controller'))

crafting.addShaped(item('tconstruct:smeltery_controller'), [
    [ore('blockSeared'), ore('ingotBrickSeared'), ore('blockSeared')],
    [ore('ingotBrickSeared'), item('minecraft:furnace'), ore('ingotBrickSeared')],
    [ore('blockSeared'), ore('ingotBrickSeared'), ore('blockSeared')]
])

// Seared Tank

crafting.removeByOutput(item('tconstruct:seared_tank'))

crafting.addShaped(item('tconstruct:seared_tank'), [
    [ore('blockSeared'), ore('ingotBrickSeared'), ore('blockSeared')],
    [ore('ingotBrickSeared'), ore('blockGlassBlack'), ore('ingotBrickSeared')],
    [ore('blockSeared'), ore('ingotBrickSeared'), ore('blockSeared')]
])

// Seared Gauge

crafting.removeByOutput(item('tconstruct:seared_tank', 1))

crafting.addShaped(item('tconstruct:seared_tank', 1), [
    [ore('blockSeared'), ore('blockGlassBlack'), ore('blockSeared')],
    [ore('blockGlassBlack'), ore('blockGlassBlack'), ore('blockGlassBlack')],
    [ore('blockSeared'), ore('blockGlassBlack'), ore('blockSeared')]
])

// Seared Window

crafting.removeByOutput(item('tconstruct:seared_tank', 2))

crafting.addShaped(item('tconstruct:seared_tank', 2), [
    [ore('blockSeared'), ore('blockGlassBlack'), ore('blockSeared')],
    [ore('ingotBrickSeared'), ore('blockGlassBlack'), ore('ingotBrickSeared')],
    [ore('blockSeared'), ore('blockGlassBlack'), ore('blockSeared')]
])

// Casting Channel

crafting.removeByOutput(item('tconstruct:channel'))

crafting.addShaped(item('tconstruct:channel'), [
    [ore('ingotBrickSeared'), null, ore('ingotBrickSeared')],
    [ore('ingotBrickSeared'), ore('ingotBrickSeared'), ore('ingotBrickSeared')]
])

// Casting Table

crafting.removeByOutput(item('tconstruct:casting'))

crafting.addShaped(item('tconstruct:casting'), [
    [ore('blockSeared'), ore('ingotBrickSeared'), ore('blockSeared')],
    [ore('ingotBrickSeared'), null, ore('ingotBrickSeared')],
    [ore('blockSeared'), null, ore('blockSeared')]
])

// Casting Basin

crafting.removeByOutput(item('tconstruct:casting', 1))

crafting.addShaped(item('tconstruct:casting', 1), [
    [ore('blockSeared'), null, ore('blockSeared')],
    [ore('ingotBrickSeared'), null, ore('ingotBrickSeared')],
    [ore('blockSeared'), ore('ingotBrickSeared'), ore('blockSeared')]
])

// Seared Drain

crafting.removeByOutput(item('tconstruct:smeltery_io'))

crafting.addShaped(item('tconstruct:smeltery_io'), [
    [ore('blockSeared'), ore('ingotBrickSeared'), ore('blockSeared')],
    [ore('ingotBrickSeared'), item('tconstruct:channel'), ore('ingotBrickSeared')],
    [ore('blockSeared'), ore('ingotBrickSeared'), ore('blockSeared')]
])

// Seared Glass

crafting.removeByOutput(item('tconstruct:seared_glass'))

crafting.addShaped(item('tconstruct:seared_glass'), [
    [null, ore('ingotBrickSeared'), null],
    [ore('ingotBrickSeared'), ore('blockGlassBlack'), ore('ingotBrickSeared')],
    [null, ore('ingotBrickSeared'), null]
])

// Seared Furnace Controller

crafting.removeByOutput(item('tconstruct:seared_furnace_controller'))
mods.tconstruct.casting_basin.removeByOutput(item('tconstruct:seared_furnace_controller'))

crafting.addShaped(item('tconstruct:seared_furnace_controller'), [
    [ore('ingotBrickSeared'), ore('blockSeared'), ore('ingotBrickSeared')],
    [ore('blockSeared'), item('minecraft:furnace'), ore('blockSeared')],
    [ore('ingotBrickSeared'), ore('blockSeared'), ore('ingotBrickSeared')]
])

// Tinker Tank Controller

crafting.removeByOutput(item('tconstruct:tinker_tank_controller'))

crafting.addShaped(item('tconstruct:tinker_tank_controller'), [
    [ore('blockSeared'), ore('ingotBrickSeared'), ore('blockSeared')],
    [ore('ingotBrickSeared'), item('minecraft:bucket'), ore('ingotBrickSeared')],
    [ore('blockSeared'), ore('ingotBrickSeared'), ore('blockSeared')]
])

// Tool Forge

crafting.removeByOutput(item('tconstruct:toolforge'))



crafting.addShaped(item('tconstruct:toolforge').withNbt(['textureBlock': ['id': 'minecraft:iron_block', 'Count': 1, 'Damage': (short) 0]]), [
    [ore('blockSeared'), ore('blockSeared'), ore('blockSeared')],
    [item('twilightforest:naga_scale'), ore('blockDiamond'), item('twilightforest:naga_scale')],
    [ore('blockIron'), item('tconstruct:tooltables', 3), ore('blockIron')]
])