/**
 * <copyright>
 * (C) Copyright 2011 CSI-PIEMONTE;

 * Concesso in licenza a norma dell'EUPL, esclusivamente versione 1.1;
 * Non e' possibile utilizzare l'opera salvo nel rispetto della Licenza.
 * E' possibile ottenere una copia della Licenza al seguente indirizzo:
 *
 * http://www.eupl.it/opensource/eupl-1-1
 *
 * Salvo diversamente indicato dalla legge applicabile o concordato per 
 * iscritto, il software distribuito secondo i termini della Licenza e' 
 * distribuito "TAL QUALE", SENZA GARANZIE O CONDIZIONI DI ALCUN TIPO,
 * esplicite o implicite.
 * Si veda la Licenza per la lingua specifica che disciplina le autorizzazioni
 * e le limitazioni secondo i termini della Licenza.
 * </copyright>
 *
 * $Id$
 */
package it.csi.mddtools.datagen.workflow.component;

import it.csi.mddtools.datagen.genutils.MiscUtils;

import java.util.Properties;

import mddtools.usagetracking.ProfilingPacketBuilder;
import mddtools.usagetracking.TrackingSender;

import org.eclipse.emf.mwe.core.WorkflowContext;
import org.eclipse.emf.mwe.core.issues.Issues;
import org.eclipse.emf.mwe.core.lib.AbstractWorkflowComponent;
import org.eclipse.emf.mwe.core.monitor.ProgressMonitor;

public class TrackingInvoker extends AbstractWorkflowComponent{

	public void checkConfiguration(Issues issues) {
		// TODO Auto-generated method stub
		
	}

	public void invokeInternal(WorkflowContext ctx, ProgressMonitor monitor,
			Issues issues) {
		// TODO Auto-generated method stub
		System.out.println("invoke TrackingInvoker");
	}

	public void setTrack(boolean b) {
		if (TrackingSender.isTrackingActive()) {
			System.out.println("setTrack:" + modelName);
			Properties info = ProfilingPacketBuilder.packGenerateInfo(
					MiscUtils.getPluginName(), MiscUtils.getPluginVersion(),
					modelName, "?", targetProjectName);
			System.out.println("333");
			TrackingSender.sendTrackingInfo(info);
		}
	}
	
	public void setModelName(String modelName) {
		this.modelName = modelName;
	}

	public String getModelName() {
		return modelName;
	}

	public void setTargetProjectName(String targetProjectName) {
		this.targetProjectName = targetProjectName;
	}

	public String getTargetProjectName() {
		return targetProjectName;
	}

	private String modelName;
	private String targetProjectName;
}
