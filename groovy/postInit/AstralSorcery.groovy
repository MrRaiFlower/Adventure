import hellfirepvp.astralsorcery.common.crafting.ShapedLightProximityRecipe
import hellfirepvp.astralsorcery.common.crafting.helper.ShapedRecipeSlot
import hellfirepvp.astralsorcery.common.crafting.helper.ShapeMap

// Luminous Crafting Table

crafting.removeByOutput(item('astralsorcery:blockaltar'))

// crafting.add(new ShapedLightProximityRecipe(resource('adventure:luminous_crafting_table'), item('astralsorcery:blockaltar'), new ShapeMap().with({
//     put(ShapedRecipeSlot.UPPER_LEFT, mods.astral.toItemHandle(ore('stoneMarble')))
//     put(ShapedRecipeSlot.UPPER_CENTER, mods.astral.toItemHandle(item('astralsorcery:blockblackmarble')))
//     put(ShapedRecipeSlot.UPPER_RIGHT, mods.astral.toItemHandle(ore('stoneMarble')))
//     put(ShapedRecipeSlot.LEFT, mods.astral.toItemHandle(ore('plankTreatedWood')))
//     put(ShapedRecipeSlot.CENTER, mods.astral.toItemHandle(ore('workbench')))
//     put(ShapedRecipeSlot.RIGHT, mods.astral.toItemHandle(ore('plankTreatedWood')))
//     put(ShapedRecipeSlot.LOWER_LEFT, mods.astral.toItemHandle(ore('plankTreatedWood')))
//     put(ShapedRecipeSlot.LOWER_CENTER, mods.astral.toItemHandle(item('botania:storage')))
//     put(ShapedRecipeSlot.LOWER_LEFT, mods.astral.toItemHandle(ore('plankTreatedWood')))
//     bake()
// })))