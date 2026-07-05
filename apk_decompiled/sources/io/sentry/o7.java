package io.sentry;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.Queue;

/* JADX INFO: loaded from: classes.dex */
public final class o7 implements Queue, Collection, Serializable {
    public final i E;
    public final io.sentry.util.a F = new io.sentry.util.a();

    public o7(i iVar) {
        this.E = iVar;
    }

    @Override // java.util.Queue, java.util.Collection
    public final boolean add(Object obj) {
        v vVarA = this.F.a();
        try {
            boolean zAdd = this.E.add(obj);
            vVarA.close();
            return zAdd;
        } catch (Throwable th) {
            try {
                vVarA.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // java.util.Collection
    public final boolean addAll(Collection collection) {
        v vVarA = this.F.a();
        try {
            boolean zAddAll = this.E.addAll(collection);
            vVarA.close();
            return zAddAll;
        } catch (Throwable th) {
            try {
                vVarA.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // java.util.Collection
    public final void clear() {
        v vVarA = this.F.a();
        try {
            this.E.clear();
            vVarA.close();
        } catch (Throwable th) {
            try {
                vVarA.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // java.util.Collection
    public final boolean contains(Object obj) {
        v vVarA = this.F.a();
        try {
            boolean zContains = this.E.contains(obj);
            vVarA.close();
            return zContains;
        } catch (Throwable th) {
            try {
                vVarA.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // java.util.Collection
    public final boolean containsAll(Collection collection) {
        v vVarA = this.F.a();
        try {
            boolean zContainsAll = this.E.containsAll(collection);
            vVarA.close();
            return zContainsAll;
        } catch (Throwable th) {
            try {
                vVarA.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // java.util.Queue
    public final Object element() {
        v vVarA = this.F.a();
        try {
            Object objElement = this.E.element();
            vVarA.close();
            return objElement;
        } catch (Throwable th) {
            try {
                vVarA.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // java.util.Collection
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        v vVarA = this.F.a();
        try {
            boolean zEquals = this.E.equals(obj);
            vVarA.close();
            return zEquals;
        } catch (Throwable th) {
            try {
                vVarA.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // java.util.Collection
    public final int hashCode() {
        v vVarA = this.F.a();
        try {
            int iHashCode = this.E.hashCode();
            vVarA.close();
            return iHashCode;
        } catch (Throwable th) {
            try {
                vVarA.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        v vVarA = this.F.a();
        try {
            boolean zIsEmpty = this.E.isEmpty();
            vVarA.close();
            return zIsEmpty;
        } catch (Throwable th) {
            try {
                vVarA.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return this.E.iterator();
    }

    @Override // java.util.Queue
    public final boolean offer(Object obj) {
        v vVarA = this.F.a();
        try {
            boolean zOffer = this.E.offer(obj);
            vVarA.close();
            return zOffer;
        } catch (Throwable th) {
            try {
                vVarA.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // java.util.Queue
    public final Object peek() {
        v vVarA = this.F.a();
        try {
            Object objPeek = this.E.peek();
            vVarA.close();
            return objPeek;
        } catch (Throwable th) {
            try {
                vVarA.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // java.util.Queue
    public final Object poll() {
        v vVarA = this.F.a();
        try {
            Object objPoll = this.E.poll();
            vVarA.close();
            return objPoll;
        } catch (Throwable th) {
            try {
                vVarA.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // java.util.Queue
    public final Object remove() {
        v vVarA = this.F.a();
        try {
            Object objRemove = this.E.remove();
            vVarA.close();
            return objRemove;
        } catch (Throwable th) {
            try {
                vVarA.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // java.util.Collection
    public final boolean removeAll(Collection collection) {
        v vVarA = this.F.a();
        try {
            boolean zRemoveAll = this.E.removeAll(collection);
            vVarA.close();
            return zRemoveAll;
        } catch (Throwable th) {
            try {
                vVarA.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // java.util.Collection
    public final boolean retainAll(Collection collection) {
        v vVarA = this.F.a();
        try {
            boolean zRetainAll = this.E.retainAll(collection);
            vVarA.close();
            return zRetainAll;
        } catch (Throwable th) {
            try {
                vVarA.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // java.util.Collection
    public final int size() {
        v vVarA = this.F.a();
        try {
            int size = this.E.size();
            vVarA.close();
            return size;
        } catch (Throwable th) {
            try {
                vVarA.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        v vVarA = this.F.a();
        try {
            Object[] array = this.E.toArray();
            vVarA.close();
            return array;
        } catch (Throwable th) {
            try {
                vVarA.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final String toString() {
        v vVarA = this.F.a();
        try {
            String string = this.E.toString();
            vVarA.close();
            return string;
        } catch (Throwable th) {
            try {
                vVarA.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // java.util.Collection
    public final boolean remove(Object obj) {
        v vVarA = this.F.a();
        try {
            boolean zRemove = this.E.remove(obj);
            vVarA.close();
            return zRemove;
        } catch (Throwable th) {
            try {
                vVarA.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        v vVarA = this.F.a();
        try {
            Object[] array = this.E.toArray(objArr);
            vVarA.close();
            return array;
        } catch (Throwable th) {
            try {
                vVarA.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
