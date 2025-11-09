// Orechid

mods.botania.orechid.removeByOutput(ore('oreMithril'))

// Petal Apothecary

crafting.removeByOutput(item('botania:altar'))

crafting.addShaped(item('botania:altar'), [
    [item('appliedenergistics2:sky_stone_brick_slab'), item('botania:petal:*'), item('appliedenergistics2:sky_stone_brick_slab')],
    [ore('crystalCertusQuartz'), item('appliedenergistics2:sky_stone_brick'), ore('crystalCertusQuartz')],
    [item('appliedenergistics2:sky_stone_brick'), item('appliedenergistics2:quartz_block'), item('appliedenergistics2:sky_stone_brick')]
])

// Natura Pylon

crafting.removeByOutput(item('botania:pylon', 1))

crafting.addShaped(item('botania:pylon', 1), [
    [ore('nuggetTerrasteel'), ore('ingotSteel'), ore('nuggetTerrasteel')],
    [ore('ingotElectrum'), item('botania:pylon'), ore('ingotElectrum')],
    [ore('nuggetTerrasteel'), ore('ingotSteel'), ore('nuggetTerrasteel')]
])

// Elven Gateway Core

crafting.removeByOutput(item('botania:alfheimportal'))

crafting.addShaped(item('botania:alfheimportal'), [
    [ore('livingwood'), ore('ingotAstralStarmetal'), ore('livingwood')],
    [item('bloodmagic:blood_shard'), ore('nuggetTerrasteel'), item('bloodmagic:blood_shard')],
    [ore('livingwood'), ore('ingotAstralStarmetal'), ore('livingwood')]
])