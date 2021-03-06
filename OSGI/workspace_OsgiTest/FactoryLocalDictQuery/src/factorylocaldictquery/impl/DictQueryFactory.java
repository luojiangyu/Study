package factorylocaldictquery.impl;

import org.osgi.framework.Bundle;
import org.osgi.framework.ServiceFactory;
import org.osgi.framework.ServiceRegistration;

import dictquery.query.QueryService;

public class DictQueryFactory implements ServiceFactory<QueryService> {

	@Override
	public QueryService getService(Bundle bundle,
			ServiceRegistration<QueryService> registration) {
		System.out.println(bundle.getSymbolicName()+" get service");
		return new FALocalDictQuery();
	}

	@Override
	public void ungetService(Bundle bundle,
			ServiceRegistration<QueryService> registration, QueryService service) {
		System.out.println(bundle.getSymbolicName()+" unget service");
	}

}
