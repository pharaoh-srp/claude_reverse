package com.anthropic.claude.protos.push;

import defpackage.mdj;
import defpackage.ujb;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\f\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\f\u0010\t\u001a\u0004\b\r\u0010\u000bR\u0017\u0010\u000e\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u000e\u0010\t\u001a\u0004\b\u000f\u0010\u000bR\u0017\u0010\u0010\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u0010\u0010\t\u001a\u0004\b\u0011\u0010\u000bR\u0017\u0010\u0012\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u0012\u0010\t\u001a\u0004\b\u0013\u0010\u000bR\u0017\u0010\u0014\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u0014\u0010\t\u001a\u0004\b\u0015\u0010\u000b¨\u0006\u0016"}, d2 = {"Lcom/anthropic/claude/protos/push/LoggedInPushOperationsServiceDescriptors;", "", "<init>", "()V", "", "SERVICE", "Ljava/lang/String;", "Lujb;", "OPEN_CHAT", "Lujb;", "getOPEN_CHAT", "()Lujb;", "OPEN_CODE_SESSION", "getOPEN_CODE_SESSION", "OPEN_COWORK_SESSION", "getOPEN_COWORK_SESSION", "OPEN_DISPATCH", "getOPEN_DISPATCH", "OPEN_ORBIT", "getOPEN_ORBIT", "CONWAY_WAKE", "getCONWAY_WAKE", "Claude:protos"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
public final class LoggedInPushOperationsServiceDescriptors {
    public static final LoggedInPushOperationsServiceDescriptors INSTANCE = new LoggedInPushOperationsServiceDescriptors();
    public static final String SERVICE = "anthropic.claude.push.LoggedInPushOperationsService";
    private static final ujb OPEN_CHAT = new ujb(SERVICE, "OpenChat");
    private static final ujb OPEN_CODE_SESSION = new ujb(SERVICE, "OpenCodeSession");
    private static final ujb OPEN_COWORK_SESSION = new ujb(SERVICE, "OpenCoworkSession");
    private static final ujb OPEN_DISPATCH = new ujb(SERVICE, "OpenDispatch");
    private static final ujb OPEN_ORBIT = new ujb(SERVICE, "OpenOrbit");
    private static final ujb CONWAY_WAKE = new ujb(SERVICE, "ConwayWake");

    private LoggedInPushOperationsServiceDescriptors() {
    }

    public final ujb getCONWAY_WAKE() {
        return CONWAY_WAKE;
    }

    public final ujb getOPEN_CHAT() {
        return OPEN_CHAT;
    }

    public final ujb getOPEN_CODE_SESSION() {
        return OPEN_CODE_SESSION;
    }

    public final ujb getOPEN_COWORK_SESSION() {
        return OPEN_COWORK_SESSION;
    }

    public final ujb getOPEN_DISPATCH() {
        return OPEN_DISPATCH;
    }

    public final ujb getOPEN_ORBIT() {
        return OPEN_ORBIT;
    }
}
