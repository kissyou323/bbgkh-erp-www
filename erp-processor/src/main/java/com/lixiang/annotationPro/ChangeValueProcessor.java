package com.lixiang.annotationPro;

import com.lixiang.annotationPro.annotations.ChangeValue;


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
public class ChangeValueProcessor extends AbstractProcessor {


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

    /**
     * 支持的注解类型，可用
     *   @SupportedAnnotationTypes({"com.lixiang.annotationPro.annotations.ChangeValue"})
     * 代替
     * @return
     */
    @Override public Set<String> getSupportedAnnotationTypes() {
        Set<String> annotataions = new LinkedHashSet<String>();
        annotataions.add(ChangeValue.class.getCanonicalName());
        return annotataions;
    }
    @Override
    public SourceVersion getSupportedSourceVersion() {
        return SourceVersion.latestSupported();
    }
    @Override
    public boolean process(Set<? extends TypeElement> annotations, RoundEnvironment roundEnv) {

        //如果是ChangeValue注解
        for(Element annotatedElement :roundEnv.getElementsAnnotatedWith(ChangeValue.class)){
            //如果注解出现在方法上
            if(annotatedElement.getKind()== ElementKind.METHOD){
                TypeElement methodElement = (TypeElement) annotatedElement;

                processingEnv.getMessager().printMessage(Diagnostic.Kind.NOTE,"annotation claa :"+
                        methodElement.getQualifiedName());

            }

        }

        return true;
    }
}
