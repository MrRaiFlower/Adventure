// Twilight Gem

mods.tconstruct.casting_table.recipeBuilder()
    .fluidInput(fluid('knightslime') * 576)
    .output(item('adventure:twilight_gem'))
    .coolingTime(200)
    .consumesCast(true)
    .cast(item('minecraft:diamond'))
    .register()

// Leather

crafting.addShaped(item('adventure:leather_bound'), [
    [ore('string'), ore('leather'), ore('string')],
    [ore('leather'), ore('dustSalt'), ore('leather')],
    [ore('string'), ore('leather'), ore('string')]
])

mods.tconstruct.drying.recipeBuilder()
    .input(item('adventure:leather_bound'))
    .output(item('adventure:leather_tanned'))
    .time(12000)
    .register()