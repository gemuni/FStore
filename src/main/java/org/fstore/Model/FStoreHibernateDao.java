package org.fstore.Model;

import java.io.Serializable;
import java.util.List;
import org.springframework.beans.*;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;

@Repository
public class FStoreHibernateDao <T extends Serializable>
extends AbstractDAOModel<T> implements IGenericDao<T> {
}
