package com.anthropic.claude.protos.push;

import defpackage.iei;
import defpackage.mdj;
import defpackage.tp4;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H¦@¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0007H¦@¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\nH¦@¢\u0006\u0004\b\u000b\u0010\fJ\u0018\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\rH¦@¢\u0006\u0004\b\u000e\u0010\u000fJ\u0018\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0010H¦@¢\u0006\u0004\b\u0011\u0010\u0012J\u0018\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0013H¦@¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016À\u0006\u0003"}, d2 = {"Lcom/anthropic/claude/protos/push/LoggedInPushOperationsService;", "", "Lcom/anthropic/claude/protos/push/OpenChatRequest;", "request", "Liei;", "openChat", "(Lcom/anthropic/claude/protos/push/OpenChatRequest;Ltp4;)Ljava/lang/Object;", "Lcom/anthropic/claude/protos/push/OpenCodeSessionRequest;", "openCodeSession", "(Lcom/anthropic/claude/protos/push/OpenCodeSessionRequest;Ltp4;)Ljava/lang/Object;", "Lcom/anthropic/claude/protos/push/OpenCoworkSessionRequest;", "openCoworkSession", "(Lcom/anthropic/claude/protos/push/OpenCoworkSessionRequest;Ltp4;)Ljava/lang/Object;", "Lcom/anthropic/claude/protos/push/OpenDispatchRequest;", "openDispatch", "(Lcom/anthropic/claude/protos/push/OpenDispatchRequest;Ltp4;)Ljava/lang/Object;", "Lcom/anthropic/claude/protos/push/OpenOrbitRequest;", "openOrbit", "(Lcom/anthropic/claude/protos/push/OpenOrbitRequest;Ltp4;)Ljava/lang/Object;", "Lcom/anthropic/claude/protos/push/ConwayWakeRequest;", "conwayWake", "(Lcom/anthropic/claude/protos/push/ConwayWakeRequest;Ltp4;)Ljava/lang/Object;", "Claude:protos"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
public interface LoggedInPushOperationsService {
    Object conwayWake(ConwayWakeRequest conwayWakeRequest, tp4<? super iei> tp4Var);

    Object openChat(OpenChatRequest openChatRequest, tp4<? super iei> tp4Var);

    Object openCodeSession(OpenCodeSessionRequest openCodeSessionRequest, tp4<? super iei> tp4Var);

    Object openCoworkSession(OpenCoworkSessionRequest openCoworkSessionRequest, tp4<? super iei> tp4Var);

    Object openDispatch(OpenDispatchRequest openDispatchRequest, tp4<? super iei> tp4Var);

    Object openOrbit(OpenOrbitRequest openOrbitRequest, tp4<? super iei> tp4Var);
}
