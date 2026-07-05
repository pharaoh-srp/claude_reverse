package com.anthropic.claude.connector.auth;

import defpackage.mdj;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0005\u0003\u0004\u0005\u0006\u0007\u0082\u0001\u0005\b\t\n\u000b\f¨\u0006\r"}, d2 = {"Lcom/anthropic/claude/connector/auth/McpAuthException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "Cancelled", "Denied", "MissingCallbackParameters", "StartFailed", "ExchangeFailed", "Lcom/anthropic/claude/connector/auth/McpAuthException$Cancelled;", "Lcom/anthropic/claude/connector/auth/McpAuthException$Denied;", "Lcom/anthropic/claude/connector/auth/McpAuthException$ExchangeFailed;", "Lcom/anthropic/claude/connector/auth/McpAuthException$MissingCallbackParameters;", "Lcom/anthropic/claude/connector/auth/McpAuthException$StartFailed;", "connector"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
public abstract class McpAuthException extends Exception {

    /* JADX INFO: loaded from: classes2.dex */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/anthropic/claude/connector/auth/McpAuthException$Cancelled;", "Lcom/anthropic/claude/connector/auth/McpAuthException;", "connector"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
    public static final class Cancelled extends McpAuthException {
    }

    /* JADX INFO: loaded from: classes2.dex */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/anthropic/claude/connector/auth/McpAuthException$Denied;", "Lcom/anthropic/claude/connector/auth/McpAuthException;", "connector"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
    public static final class Denied extends McpAuthException {
    }

    /* JADX INFO: loaded from: classes2.dex */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/anthropic/claude/connector/auth/McpAuthException$MissingCallbackParameters;", "Lcom/anthropic/claude/connector/auth/McpAuthException;", "connector"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
    public static final class MissingCallbackParameters extends McpAuthException {
    }

    /* JADX INFO: loaded from: classes2.dex */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/anthropic/claude/connector/auth/McpAuthException$StartFailed;", "Lcom/anthropic/claude/connector/auth/McpAuthException;", "connector"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
    public static final class StartFailed extends McpAuthException {
    }

    /* JADX INFO: loaded from: classes2.dex */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/anthropic/claude/connector/auth/McpAuthException$ExchangeFailed;", "Lcom/anthropic/claude/connector/auth/McpAuthException;", "connector"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
    public static final class ExchangeFailed extends McpAuthException {
        public ExchangeFailed(String str, Throwable th) {
            super("Token exchange failed: ".concat(str == null ? "unknown error" : str), th);
        }

        public /* synthetic */ ExchangeFailed(String str) {
            this(str, null);
        }
    }
}
