/**
 * generated by Xtext 2.12.0
 */
package org.xtext.project.turn.ui.labeling;

import com.google.inject.Inject;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.xtext.xbase.ui.labeling.XbaseLabelProvider;

/**
 * Provides labels for EObjects.
 * 
 * See https://www.eclipse.org/Xtext/documentation/304_ide_concepts.html#label-provider
 */
@SuppressWarnings("all")
public class TurnLabelProvider extends XbaseLabelProvider {
  @Inject
  public TurnLabelProvider(final AdapterFactoryLabelProvider delegate) {
    super(delegate);
  }
}
