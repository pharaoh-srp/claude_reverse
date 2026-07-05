package com.anthropic.claude.chat.bottomsheet.tool.approval.appuse;

import com.anthropic.claude.chat.bottomsheet.tool.approval.appuse.MobileAppUseDestination;
import defpackage.jce;
import defpackage.kce;
import defpackage.lq6;
import defpackage.odf;
import defpackage.pl9;
import java.lang.annotation.Annotation;
import kotlinx.serialization.KSerializer;

/* JADX INFO: loaded from: classes2.dex */
public final class a {
    public static final /* synthetic */ a a = new a();

    public final KSerializer serializer() {
        kce kceVar = jce.a;
        return new odf("com.anthropic.claude.chat.bottomsheet.tool.approval.appuse.MobileAppUseDestination", kceVar.b(MobileAppUseDestination.class), new pl9[]{kceVar.b(MobileAppUseDestination.Approval.class), kceVar.b(MobileAppUseDestination.CalendarSelection.class), kceVar.b(MobileAppUseDestination.Dismissed.class)}, new KSerializer[]{new lq6("com.anthropic.claude.chat.bottomsheet.tool.approval.appuse.MobileAppUseDestination.Approval", MobileAppUseDestination.Approval.INSTANCE, new Annotation[0]), new lq6("com.anthropic.claude.chat.bottomsheet.tool.approval.appuse.MobileAppUseDestination.CalendarSelection", MobileAppUseDestination.CalendarSelection.INSTANCE, new Annotation[0]), new lq6("com.anthropic.claude.chat.bottomsheet.tool.approval.appuse.MobileAppUseDestination.Dismissed", MobileAppUseDestination.Dismissed.INSTANCE, new Annotation[0])}, new Annotation[0]);
    }
}
