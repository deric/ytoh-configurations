package cz.cvut.fit.alg.params.api;

import java.awt.Component;
import java.lang.annotation.Annotation;
import cz.cvut.fit.alg.params.Property;
import cz.cvut.fit.alg.params.context.PublishingContext;

/**
 * <code>PropertyEditor</code> is used to retrieve a {@link Component} capable of editing
 * the underlying property.
 *
 * @author ytoh
 * @param <T>
 * @param <A>
 */
public interface PropertyEditor<T, A extends Annotation> {

    /**
     * Returns a {@link Component} that is bound to the supplied {@link Property}
     * and is capable of modifying it.
     *
     * @param property <code>Property</code> to edit
     * @param annotation {@link Annotation} defining this editor
     * @param context dynamic context to retrieve options from
     * @return <code>Component</code> bound to the supplied <code>property</code>
     */
    Component getEditorComponent(Property<T> property, A annotation, PublishingContext context);
}
