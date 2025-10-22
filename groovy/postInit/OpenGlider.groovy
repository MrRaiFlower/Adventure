// Glider Wings

crafting.removeByOutput(item('openglider:hang_glider_part'))
crafting.removeByOutput(item('openglider:hang_glider_part', 1))

crafting.addShaped(item('openglider:hang_glider_part'), [
    [null, ore('stickIron'), ore('leather')],
    [ore('stickIron'), ore('leather'), item('adventure:leather_tanned')],
    [ore('leather'), item('adventure:leather_tanned'), ore('ingotIron')]
])

crafting.addShaped(item('openglider:hang_glider_part', 1), [
    [ore('leather'), ore('stickIron'), null],
    [item('adventure:leather_tanned'), ore('leather'), ore('stickIron')],
    [ore('ingotIron'), item('adventure:leather_tanned'), ore('leather')]
])

// Scaffolding

crafting.removeByOutput(item('openglider:hang_glider_part', 2))

crafting.addShaped(item('openglider:hang_glider_part', 2), [
    [null, ore('ingotIron'), null],
    [ore('stickIron'), null, ore('stickIron')],
    [ore('ingotIron'), ore('stickIron'), ore('ingotIron')]
])

// Advanced Glider

crafting.removeByOutput(item('openglider:hang_glider_advanced'))

