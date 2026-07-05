package com.anthropic.claude.settings.internal;

import com.anthropic.claude.settings.internal.InternalSettingsAppScreen;
import defpackage.jce;
import defpackage.kce;
import defpackage.lq6;
import defpackage.odf;
import defpackage.pl9;
import java.lang.annotation.Annotation;
import kotlinx.serialization.KSerializer;

/* JADX INFO: loaded from: classes3.dex */
public final class b {
    public static final /* synthetic */ b a = new b();

    public final KSerializer serializer() {
        kce kceVar = jce.a;
        return new odf("com.anthropic.claude.settings.internal.InternalSettingsAppScreen", kceVar.b(InternalSettingsAppScreen.class), new pl9[]{kceVar.b(InternalSettingsAppScreen.EndpointSelectionScreen.class), kceVar.b(InternalSettingsAppScreen.GrowthBookFeatureJsonEditor.class), kceVar.b(InternalSettingsAppScreen.GrowthBookOverrideScreen.class), kceVar.b(InternalSettingsAppScreen.InternalSettings.class), kceVar.b(InternalSettingsAppScreen.NetworkSimulationScreen.class), kceVar.b(InternalSettingsAppScreen.PushSettingsScreen.class)}, new KSerializer[]{new lq6("com.anthropic.claude.settings.internal.InternalSettingsAppScreen.EndpointSelectionScreen", InternalSettingsAppScreen.EndpointSelectionScreen.INSTANCE, new Annotation[0]), c.a, new lq6("com.anthropic.claude.settings.internal.InternalSettingsAppScreen.GrowthBookOverrideScreen", InternalSettingsAppScreen.GrowthBookOverrideScreen.INSTANCE, new Annotation[0]), new lq6("com.anthropic.claude.settings.internal.InternalSettingsAppScreen.InternalSettings", InternalSettingsAppScreen.InternalSettings.INSTANCE, new Annotation[0]), new lq6("com.anthropic.claude.settings.internal.InternalSettingsAppScreen.NetworkSimulationScreen", InternalSettingsAppScreen.NetworkSimulationScreen.INSTANCE, new Annotation[0]), new lq6("com.anthropic.claude.settings.internal.InternalSettingsAppScreen.PushSettingsScreen", InternalSettingsAppScreen.PushSettingsScreen.INSTANCE, new Annotation[0])}, new Annotation[0]);
    }
}
