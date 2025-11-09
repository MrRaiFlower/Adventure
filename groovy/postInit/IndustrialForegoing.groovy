// Machine Case

crafting.removeByOutput(item('teslacorelib:machine_case'))

crafting.addShaped(item('teslacorelib:machine_case'), [
    [ore('ingotSteel'), ore('ingotElectrum'), ore('ingotSteel')],
    [ore('ingotIron'), ore('blockRedstone'), ore('ingotIron')],
    [ore('ingotSteel'), ore('ingotElectrum'), ore('ingotSteel')]
])