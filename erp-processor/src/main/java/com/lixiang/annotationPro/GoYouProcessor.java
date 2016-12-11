package com.lixiang.annotationPro;

import com.lixiang.main.testJavaPoet;

import javax.annotation.processing.*;
import javax.lang.model.SourceVersion;
import javax.lang.model.element.Element;
import javax.lang.model.element.ElementKind;
import javax.lang.model.element.TypeElement;
import javax.lang.model.util.Elements;
import javax.lang.model.util.Types;
import javax.tools.Diagnostic;
import java.util.LinkedHashSet;
import java.util.Set;


/**
 * Created by lixiang on 2016/8/6.
 */

public class GoYouProcessor extends AbstractProcessor {


    private Types typeUtils;
    private Elements elementUtils;
    private Filer filer;
    private Messager messager;


    @Override
    public synchronized void init(ProcessingEnvironment processingEnv) {
        super.init(processingEnv);
        typeUtils = processingEnv.getTypeUtils();
        elementUtils = processingEnv.getElementUtils();
        filer = processingEnv.getFiler();
        messager = processingEnv.getMessager();
    }

    @Override public Set<String> getSupportedAnnotationTypes() {
        Set<String> annotataions = new LinkedHashSet<String>();
        annotataions.add(GoYou.class.getCanonicalName());
        return annotataions;
    }
    @Override
    public SourceVersion getSupportedSourceVersion() {
        return SourceVersion.latestSupported();
    }
    @Override
    public boolean process(Set<? extends TypeElement> annotations, RoundEnvironment roundEnv) {

        for (TypeElement te : annotations) {
            for (Element e : roundEnv.getElementsAnnotatedWith(te)) {
                messager.printMessage(Diagnostic.Kind.NOTE, "Printing: " + e.toString());
            }
        }
        for(Element annotatedElement :roundEnv.getElementsAnnotatedWith(GoYou.class)){

            if(annotatedElement.getKind()== ElementKind.CLASS){
                TypeElement classElement = (TypeElement) annotatedElement;
                processingEnv.getMessager().printMessage(Diagnostic.Kind.NOTE,"annotation claa :"+
                classElement.getQualifiedName());

            }
            
            new testJavaPoet().generateHelloWorld();
           /* com.lixiang.annotation.GoYou goYou  = annotatedElement.getAnnotation(com.lixiang.annotation.GoYou.class);
            String message = "annotation found in " + annotatedElement.getSimpleName();
            processingEnv.getMessager().printMessage(Diagnostic.Kind.NOTE, message);
            System.out.println("aaaaaaaa");*/
          /*  ExecutableElement m =(ExecutableElement) annotatedElement;
            TypeElement className = (TypeElement)m.getEnclosingElement();
            System.out.println(className);*/
        }

        return true;
    }
}
