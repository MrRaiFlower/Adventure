// Salis Mundus

mods.astralsorcery.starlight_altar.discoveryRecipeBuilder()
    .output(item('thaumcraft:salis_mundus') * 3)
    .row('ABA')
    .row('CDE')
    .row('AFA')
    .key('A', item('thaumcraft:crystal_essence'))
    .key('B', ore('dustAstralStarmetal'))
    .key('C', item('mekanism:otherdust'))
    .key('D', ore('pestleAndMortar'))
    .key('E', ore('elvenPixieDust'))
    .key('F', ore('dustRedstone'))
    .starlight(500)
    .craftTime(10)
    .register()

// Arcane Stone

crafting.remove("thaumcraft:stonearcane")

crafting.addShaped(item('thaumcraft:stone_arcane') * 8, [
    [ore('livingrock'), item('appliedenergistics2:smooth_sky_stone_block'), ore('livingrock')],
    [item('appliedenergistics2:smooth_sky_stone_block'), item('thaumcraft:crystal_essence'), item('appliedenergistics2:smooth_sky_stone_block')],
    [ore('livingrock'), item('appliedenergistics2:smooth_sky_stone_block'), ore('livingrock')]
])