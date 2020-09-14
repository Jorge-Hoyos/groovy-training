devMap = [:]
devMap = ['name':'Roberto', 'framework':'Grails', 'language':'Groovy']
devMap.put('lastName','Perez')

devMap.each { println "$it.key: $it.value" }
devMap.eachWithIndex { it, i -> println "$i: $it"}

assert devMap.containsKey('name')
assert devMap.containsValue('Roberto')
println devMap.keySet()
println devMap.values()
