package sample.spring.chapter03.bankapp.service;

import org.apache.log4j.Logger;

import sample.spring.chapter03.bankapp.base.ServiceTemplate;
import sample.spring.chapter03.bankapp.dao.FixedDepositDao;
import sample.spring.chapter03.bankapp.domain.FixedDepositDetails;

public class FixedDepositServiceImpl extends ServiceTemplate implements FixedDepositService {
	private static Logger logger = Logger
			.getLogger(FixedDepositServiceImpl.class);

	private FixedDepositDao fixedDepositDao;

	public FixedDepositServiceImpl() {
		logger.info("initializing");
	}

	public FixedDepositDao getFixedDepositDao() {
		return fixedDepositDao;
	}

	public void setFixedDepositDao(FixedDepositDao fixedDepositDao) {
		logger.info("Setting fixedDepositDao property");
		this.fixedDepositDao = fixedDepositDao;
	}

	public FixedDepositDetails getFixedDepositDetails(long id) {
		return fixedDepositDao.getFixedDepositDetails(id);
	}

	public boolean createFixedDeposit(FixedDepositDetails fdd) {
		return fixedDepositDao.createFixedDeposit(fdd);
	}
}
