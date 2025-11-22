// Salis Mundus

crafting.removeByOutput(item('thaumcraft:salis_mundus'))

crafting.addShaped(item('thaumcraft:salis_mundus') * 3, [
    [ item('thaumcraft:crystal_essence'), item('bloodmagic:blood_shard'),  item('thaumcraft:crystal_essence')],
    [ore('dustAstralStarmetal'), ore('pestleAndMortar'), ore('dustAstralStarmetal')],
    [ item('thaumcraft:crystal_essence'), item('bloodmagic:blood_shard'),  item('thaumcraft:crystal_essence')]
])

// Arcane Stone

crafting.remove("thaumcraft:stonearcane")

crafting.addShaped(item('thaumcraft:stone_arcane') * 8, [
    [ore('livingrock'), item('appliedenergistics2:smooth_sky_stone_block'), ore('livingrock')],
    [item('appliedenergistics2:smooth_sky_stone_block'), item('thaumcraft:crystal_essence'), item('appliedenergistics2:smooth_sky_stone_block')],
    [ore('livingrock'), item('appliedenergistics2:smooth_sky_stone_block'), ore('livingrock')]
])