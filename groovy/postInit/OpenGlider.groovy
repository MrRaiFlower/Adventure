// Glider Wings

crafting.removeByOutput(item('openglider:hang_glider_part'))
crafting.removeByOutput(item('openglider:hang_glider_part', 1))

crafting.addShaped(item('openglider:hang_glider_part'), [
    [null, ore('stickIron'), item('adventure:leather_tanned')],
    [ore('stickIron'), item('adventure:leather_tanned'), item('adventure:leather_tanned')],
    [item('adventure:leather_tanned'), item('adventure:leather_tanned'), item('adventure:leather_tanned')]
])

crafting.addShaped(item('openglider:hang_glider_part', 1), [
    [item('adventure:leather_tanned'), ore('stickIron'), null],
    [item('adventure:leather_tanned'), item('adventure:leather_tanned'), ore('stickIron')],
    [item('adventure:leather_tanned'), item('adventure:leather_tanned'), item('adventure:leather_tanned')]
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

crafting.addShaped(item('openglider:hang_glider_advanced'), [
    [null, ore('ingotSteel'), null],
    [ore('stickSteel'), item('openglider:hang_glider_basic'), ore('stickSteel')],
    [ore('ingotSteel'), ore('stickSteel'), ore('ingotSteel')]
])