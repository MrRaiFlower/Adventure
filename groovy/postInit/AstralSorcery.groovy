import hellfirepvp.astralsorcery.common.crafting.ShapedLightProximityRecipe
import hellfirepvp.astralsorcery.common.crafting.helper.ShapedRecipeSlot
import hellfirepvp.astralsorcery.common.crafting.helper.ShapeMap

// Sooty Marble

crafting.removeByOutput(item('astralsorcery:blockblackmarble'))

crafting.addShaped(item('astralsorcery:blockblackmarble') * 8, [
    [ore('stoneMarble'), ore('stoneMarble'), ore('stoneMarble')],
    [ore('stoneMarble'), ore('dustHOPGraphite'), ore('stoneMarble')],
    [ore('stoneMarble'), ore('stoneMarble'), ore('stoneMarble')]
])

mods.astralsorcery.starlight_altar.removeByOutput(item('astralsorcery:blockblackmarble'))

mods.astralsorcery.starlight_altar.discoveryRecipeBuilder()
    .output(item('astralsorcery:blockblackmarble') * 8)
    .row('AAA')
    .row('ABA')
    .row('AAA')
    .key('A', ore('stoneMarble'))
    .key('B', ore('dustHOPGraphite'))
    .starlight(100)
    .craftTime(20)
    .register()

// Luminous Crafting Table

crafting.removeByOutput(item('astralsorcery:blockaltar'))

crafting.add(new ShapedLightProximityRecipe(resource('adventure:luminous_crafting_table'), item('astralsorcery:blockaltar'), new ShapeMap().with({
    put(ShapedRecipeSlot.UPPER_LEFT, com.cleanroommc.groovyscript.compat.mods.astralsorcery.AstralSorcery.toItemHandle(ore('stoneMarble')))
    put(ShapedRecipeSlot.UPPER_CENTER, com.cleanroommc.groovyscript.compat.mods.astralsorcery.AstralSorcery.toItemHandle(item('astralsorcery:blockblackmarble')))
    put(ShapedRecipeSlot.UPPER_RIGHT, com.cleanroommc.groovyscript.compat.mods.astralsorcery.AstralSorcery.toItemHandle(ore('stoneMarble')))
    put(ShapedRecipeSlot.LEFT, com.cleanroommc.groovyscript.compat.mods.astralsorcery.AstralSorcery.toItemHandle(ore('plankTreatedWood')))
    put(ShapedRecipeSlot.CENTER, com.cleanroommc.groovyscript.compat.mods.astralsorcery.AstralSorcery.toItemHandle(ore('workbench')))
    put(ShapedRecipeSlot.RIGHT, com.cleanroommc.groovyscript.compat.mods.astralsorcery.AstralSorcery.toItemHandle(ore('plankTreatedWood')))
    put(ShapedRecipeSlot.LOWER_LEFT, com.cleanroommc.groovyscript.compat.mods.astralsorcery.AstralSorcery.toItemHandle(ore('plankTreatedWood')))
    put(ShapedRecipeSlot.LOWER_CENTER, com.cleanroommc.groovyscript.compat.mods.astralsorcery.AstralSorcery.toItemHandle(item('botania:storage')))
    put(ShapedRecipeSlot.LOWER_RIGHT, com.cleanroommc.groovyscript.compat.mods.astralsorcery.AstralSorcery.toItemHandle(ore('plankTreatedWood')))
    bake()
})))

// Glass Lens

mods.astralsorcery.starlight_altar.removeByOutput(item('astralsorcery:itemcraftingcomponent', 3))

mods.astralsorcery.starlight_altar.discoveryRecipeBuilder()
    .output(item('astralsorcery:itemcraftingcomponent', 3))
    .row('ABA')
    .row('BCB')
    .row('ABA')
    .key('A', ore('powderMana'))
    .key('B', item('botania:managlass'))
    .key('C', ore('gemAquamarine'))
    .starlight(200)
    .craftTime(20)
    .register()