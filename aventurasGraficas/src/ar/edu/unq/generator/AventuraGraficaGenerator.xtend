/*
 * generated by Xtext
 */
package ar.edu.unq.generator

import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IGenerator
import org.eclipse.xtext.generator.IFileSystemAccess

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
class AventuraGraficaGenerator implements IGenerator {
	
	override void doGenerate(Resource resource, IFileSystemAccess fsa) {
//		fsa.generateFile('greetings.txt', 'People to greet: ' + 
//			resource.allContents
//				.filter(typeof(Greeting))
//				.map[name]
//				.join(', '))
	}
}


//    override void doGenerate(Resource resource, IFileSystemAccess fsa) {
// val model = resource.allContents.head as Model
// val fileName = resource.URI.lastSegment
// val className = fileName.until(".").firstUpper
// 
// fsa.generateFile(className + ".java", model.generateJavaClass(className))
//    }
// 
//    def generateJavaClass(Model m, String className) '''
// public class «className» {
// public static void main(String[] args) {
// «FOR saludo : m.saludos »
// System.out.println("Hola «saludo.AQuien» !!!");
// «ENDFOR»
// }
// }
//    '''
//    ....
//}