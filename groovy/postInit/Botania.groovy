// Orechid

mods.botania.orechid.removeByOutput(ore('oreUranium'))

mods.botania.orechid.removeByOutput(ore('orePlatinum'))
mods.botania.orechid.removeByOutput(ore('oreMithril'))

// Petal Apothecary

crafting.removeByOutput(item('botania:altar'))

crafting.addShaped(item('botania:altar'), [
    [item('appliedenergistics2:sky_stone_brick_slab'), item('botania:petal:*'), item('appliedenergistics2:sky_stone_brick_slab')],
    [ore('crystalCertusQuartz'), item('appliedenergistics2:sky_stone_brick'), ore('crystalCertusQuartz')],
    [item('appliedenergistics2:sky_stone_brick'), item('appliedenergistics2:quartz_block'), item('appliedenergistics2:sky_stone_brick')]
])